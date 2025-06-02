package day29Lambda;

import java.util.*;

public class Lambda02 {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 11, 10, 14));
        //printSquareOfOddElements(nums);
        //printCubeOfDistinctOddElements(nums);
        //printSumOfSquaresOfDistinctEvenElements(nums);
        //printProductOfSquareOfDistinctEvenElements(nums);
        //maksimum1(nums);
        //maksimum2(nums);
        //maksimum3(nums);
        //maksimum4(nums);
        //minimum1(nums);
        //minimum2(nums);
        //minimum3(nums);
        //minimum4(nums);
        //minimum5(nums);
        getMinGreaterThanSevenEven(nums);


    } //main disi

    //----------------------------
    //ornek 1: Bir tamsayı listesi alan ve listedeki tek sayıların karelerini, aynı satırda,
    // aralarına boşluk koyarak yazdıran bir method oluşturunuz.(Functional)
    //example 1: Create a method that takes a list of integers and prints the squares of the
    // odd numbers in the list on the same line with a space between them.(Functional)

    public static void printSquareOfOddElements(List<Integer> nums) {

        //map(): Elemanları dönüştürmek için kullanılır.
        nums.
                stream().
                filter(t -> t % 2 != 0).
                map(t -> t * t).
                forEach(t -> System.out.print(t + " ")); //9 25 121
        //map(t -> (int) Math.pow(t, 2))

        /**
         @param
         @return
         @throws
         */
    }

    //----------------------------
    //2) Bir tamsayı listesindeki tek sayıların küplerini, tekrarlanmadan, aynı satırda,
    // aralarına boşluk koyarak yazdıran bir method oluşturunuz.(Functional)
    //2) Create a method that prints the cubes of odd numbers in a list of integers,
    // without repeating, on the same line, with spaces between them. (Functional)

    public static void printCubeOfDistinctOddElements(List<Integer> nums) {

        //distinct() metodu, bir akistaki tekrar eden ogeleri kaldirmak icin kullanilir
        //Ornegin 1,2,2,3,3,3,4,4,5 olan akisi 1,2,3,4,5 yapar

        nums.
                stream().
                distinct().
                filter(t -> t % 2 != 0).
                map(t -> t * t * t).
                forEach(t -> System.out.print(t + " ")); //27 125

    }

    //----------------------------
    //3)Bir listedeki tekrarlanmayan çift sayıların karelerinin toplamını hesaplayan bir method oluşturunuz.
    //3)Create a method that calculates the sum of squares of non-repeating even numbers in a list.

    public static void printSumOfSquaresOfDistinctEvenElements(List<Integer> nums) {
        //reduce()azaltmak: Koleksiyon elemanlarını tek bir değere indirger.
        //Ornegin iki sayiyi toplayinca tek bir sonuc elde ederiz. 3 + 5 = 8

        //reduce(0, (t,u) -> t+u); deki 0 etkisiz elemandir. carpma olsa 1 koyardik
        //t: Şu ana kadar hesaplanmış olan ara toplam. İlk iterasyonda, bu değer başlangıç değeri olan 0’dır.
        //u: Ilk elemandir
        //(t,u) -> t+u: İki girdi alarak tek bir çıktı üreten bir lambda ifadesidir.

        //İlk iterasyonda:
        //t=0 (başlangıç değeri olarak belirtildiği için)
        //u=4 (ilk eleman)
        //t+u = 4

        //İkinci iterasyonda:
        //t=4 (önceki adımdan gelen sonuç)
        //u=100 (ikinci eleman)
        //t+u = 104

        int toplam = nums.
                stream().
                distinct().
                filter(t -> t % 2 == 0).
                map(t -> t * t).
                //reduce(0, (t,u) -> t + u);
                        reduce(0, Integer::sum);

        System.out.println(toplam); //104

        /* Java’da method reference, lambda ifadelerine bir alternatif olarak sunulan bir özelliktir.
        Method reference, zaten tanımlanmış bir metodu doğrudan bir fonksiyonel arayüze atamak için kullanılır.
        Bu, bazen bir lambda ifadesinden daha okunabilir bir kod yazmamıza olanak tanır. Integer::sum*/

    }

    //----------------------------
    //4) Bir listedeki tüm tekrarlanmayan çift sayıların karelerinin çarpımını
    // hesaplayan bir method oluşturunuz.
    //4) Create a method that calculates the product of the squares of all
    // non-repeating even numbers in a list.

    public static void printProductOfSquareOfDistinctEvenElements(List<Integer> nums) {
        //2, 3, 4, 5, 11, 13
        int carp = nums.
                stream().
                distinct().
                filter(t -> t % 2 == 0).
                map(t -> t * t).
                reduce(1, (t, u) -> t * u);
        System.out.println(carp); //64
    }

    //----------------------------
    //5)Verilen List'teki maksimum değeri bulmak için bir method oluşturun.
    //5)Create a method to find the maximum value in the given List

    //-----------------
    //1.yol:
    public static void maksimum1(List<Integer> nums) {

        //Integer.MIN_VALUE: Bu, int tipinin alabileceği en küçük değeri verir (-2^31 dir)

        int max = nums.stream().distinct().reduce(Integer.MIN_VALUE, (t, u) -> t > u ? t : u);
        System.out.println(max); //11

    }

    //-----------------
    //2.yol:
    public static void maksimum2(List<Integer> nums) {

        int max = nums.stream().distinct().reduce(nums.get(0), (t, u) -> t > u ? t : u);
        System.out.println(max); //11

    }

    //-----------------
    //3.yol:
    public static void maksimum3(List<Integer> nums) {
        //sorted(): Koleksiyonu belirli bir kritere göre sıralar.(naturel order. kucukten buyuge)

        //reduce’un tek parametreli kullaniminda bir Optional doner.
        // Bu, sonucun var olabileceği veya olmayabileceği anlamına gelir.
        // Bu nedenle sonucu almak için get() metodu kullanılır.

        //2, 2, 4, 5, 11, 10
        Integer max = nums.stream().distinct().sorted().reduce((t, u) -> u).get();
        System.out.println(max); //11

    }

    //-----------------
    //4.yol: Best Practice

    public static void maksimum4(List<Integer> nums) {

        //Java'da :: işareti, "Method Reference" olarak adlandırılır.
        // Bir metodun doğrudan referansını alarak lambda ifadeleri yazmadan kullanmanızı sağlar.
        Integer max = nums.
                stream().
                distinct().
                reduce(Math::max).
                get();
        System.out.println(max);

    }

    //------------------------------------
    //6)Verilen List'teki minimum değeri bulmak için bir method oluşturun.
    //6)Create a method to find the minimum value in the given List

    //--------------
    //1.yol:
    public static void minimum1(List<Integer> nums) {
        Integer min = nums.
                stream().
                distinct(). //2, 3, 4, 5, 11, 10
                        reduce((t, u) -> t > u ? u : t).get();
        System.out.println(min); //2
    }

    //--------------
    //2.yol:

    public static void minimum2(List<Integer> nums) {

        //sorted(Comparator.reverseOrder()) ifadesi,
        // Java Stream API'si içinde bir koleksiyonu ters sıralamak için kullanılır.
        //Comparator interface, reverseOrder() methoddur.

        Integer min = nums.
                stream().
                distinct().
                sorted(Comparator.reverseOrder()). //11, 10, 5, 4, 3, 2
                        reduce((t, u) -> u).get();
        System.out.println(min); //2

    }

    //--------------
    //3.yol:

    public static void minimum3(List<Integer> nums) {

/*        Integer min = nums.
                stream().
                distinct().
                sorted(). //2, 3, 4, 5, 10, 11
                reduce((t, u) -> t).get();
        System.out.println(min); //2*/

        Optional<Integer> min = nums.stream().distinct().sorted().reduce((t, u) -> t);

        if (min.isPresent()) {
            System.out.println(min.get());
        } else {
            System.out.println("Liste bos veya minimum deger bulunamadi");
        }

    }

    //--------------
    //4.yol:

    public static void minimum4(List<Integer> nums) {
        Integer min = nums.stream().distinct().reduce((t, u) -> Math.min(t, u)).get();
        System.out.println(min); //2
    }

    //--------------
    //5.yol:

    public static void minimum5(List<Integer> nums) {
        Integer min = nums.stream().distinct().reduce(Math::min).get();
        System.out.println(min); //2
    }

    //------------------------------
    //7) Verilen listedeki 7'den büyük en küçük çift sayıyı bulan bir yöntem oluşturun.
    //2, 3, 4, 5, 11, 10, 14 ==> 10 <-- 7’den buyuk en kucuk cift sayi

    //7) Create a method that finds the smallest even number greater than 7 in the given list.
    //2, 3, 4, 5, 11, 10, 14 ==> 10 <-- Smallest even number greater than 7

    public static void getMinGreaterThanSevenEven(List<Integer> nums) {

        //findFirst(): Sıralı akışta bulunan ilk elemanı (yani bu senaryo da en küçük elemanı) alır.
        // Bu işlem bir Optional döndürür, çünkü akışta hiç eleman kalmamış olabilir
        // (filtreleme nedeniyle veya başka bir sebepten dolayı)

        //Integer min = nums.stream().filter(t -> t > 7 && t % 2 == 0).sorted().reduce((t, u) -> t).get();

        Integer min = nums.stream().filter(t -> t > 7 && t % 2 == 0).sorted().findFirst().get();
        System.out.println(min); //10


    }




}
