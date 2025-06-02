package day29Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LambdaExercise {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>(Arrays.asList("Alperen","Pinar","Ali","Ayla","Ata"));
        List<Integer> myList1 = new ArrayList<>(Arrays.asList(1,45,16,88,44,12,37));
        ArrayList<Integer> myList2 = new ArrayList<>(Arrays.asList(1,45,16,88,44,12,37));


//        uniqueWords(myList);
//        System.out.println(".......");
//        thesmallestnumberbiggerthanseven(myList1);
//        minimumvalueoflist(myList2);
//        maxValueofaList(myList1);
        sumofnumbers(myList2);
        naturalOrderAfterLenght(myList);

    }
    //ornek 2: Bir List<String> içinde karakter sayısı 5'ten az olan tüm benzersiz (tekrarsız) elemanları konsola yazdıran bir metod yazınız.
    public static void uniqueWords(List<String> myList){
       myList.stream().distinct().filter(t -> t.length()<5).forEach(t -> System.out.println(t + " "));

    }
    //7) Verilen listedeki 7'den büyük en küçük çift sayıyı bulan bir yöntem oluşturun.
    //2, 3, 4, 5, 11, 10, 14 ==> 10 <-- 7’den buyuk en kucuk cift sayi
    //7) Create a method that finds the smallest even number greater than 7 in the given list.
    //2, 3, 4, 5, 11, 10, 14 ==> 10 <-- Smallest even number greater than 7

    public  static void thesmallestnumberbiggerthanseven(List<Integer> nums){
       int num = nums.stream().distinct().filter(t -> (t>7 && t%2==0)).sorted().findFirst().get();
        System.out.println(num);

    }
    //7)Verilen List’teki minimum değeri bulmak için bir method oluşturun.
//7)Create a method to find the minimum value in the given List

    public static void minimumvalueoflist(ArrayList<Integer> nums){
        Optional<Integer> num = nums.stream().sorted().reduce((t, u) ->t);

//        if (num.isPresent()){
//            System.out.println(nums.get(0));
//        }else {
//            System.out.println("liste bos veya min deger bulunamadi");
//        }

        num.ifPresent(System.out::println);
        //System.out.println(num.orElse(-1)); buda bir secenek
        num.orElseThrow(() -> new IllegalArgumentException("Değer bulunamadı!"));

    }
    //5)Verilen List’teki maksimum değeri bulmak için bir method oluşturun.
//5)Create a method to find the maximum value in the given List

    public static void maxValueofaList(List<Integer> nums){
        //1,45,16,88,44,12,37
        Optional<Integer> num = nums.stream().distinct().sorted().reduce((t,u)->t>u?t:u);
        num.ifPresent(System.out::println);


    }
    public static void sumofnumbers(List<Integer>nums){
       Optional<Integer> total=  nums.stream().distinct().filter(t -> t%2==0).reduce((t,u)-> t+u);
       total.ifPresent(System.out::println);

    }
    public static void naturalOrderAfterLenght(List<String>names){
        names.stream().distinct().sorted((a, b) -> Integer.compare(a.length(), b.length())).forEach(t-> System.out.println(t +" "));

    }



}
