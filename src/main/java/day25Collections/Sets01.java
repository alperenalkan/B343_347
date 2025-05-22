package day25Collections;

import java.util.*;

public class Sets01 {
    public static void main(String[] args) {
        //Set’ler tekrarsiz(unique) datalari depolamak icin kullanilir. Ornegin; e-mail, tc kimlik no, il plaka no

        /*Java'da üç tür set vardır:
        1) HashSet: Bu set, elemanların hash kodlarına göre depolandığı bir settir. Elemanlar,
        her birinin benzersiz bir hash kodu (kimlik numarası) ile depolandığı bir yapıda tutulur.
        Bir eleman eklediğinizde, bu elemanın hash kodu hesaplanır ve o hash koduna karşılık gelen
        bir hücreye yerleştirilir.

        HashSet'ler, en hızlı performansı sunar.Ancak, elemanların sırasını korumazlar.
        null'i eleman olarak kabul ederler */

        HashSet<String> hset = new HashSet<>(Arrays.asList("ali","veli"));
        System.out.println(hset);

        hset.add(null);
        System.out.println(hset);
        /*2) LinkedHashSet: Bu set, elemanların eklenme sırasına göre(insertion order) depolandığı
        bir settir. LinkedHashSet class'i, HashSet class'inin child'idir.
        LinkedHashSet'ler, elemanların sırasını korumaya ihtiyaç duyulan uygulamalar için iyi bir seçimdir.
        Ancak, HashSet'lerden daha yavaş performans sunarlar. (orta)

        Ornegin; Okullarda kayit sirasina gore ogrenci bilgilerini tutmak isterseniz kullanabilirsiniz

        3) TreeSet: Bu set, elemanların doğal sırasına(natural order-kucukten buyuge) göre depolandığı bir settir.
        HashSet'ler ve LinkedHashSet'lerden daha yavaş performans sunarlar.
        Java'da TreeSet, SortedSet arayüzünü(interface) uygulayan bir class'tir.
        Bu nedenle, TreeSet bir Sorted Set'tir.*/

        LinkedHashSet<String> lhset = new LinkedHashSet<>(Set.of("ali","saban","deniz","fatih"));
        System.out.println(lhset);


        //retainAll() metodu, bir koleksiyondaki öğelerin başka bir koleksiyonla kesişimini
        // (yani her iki koleksiyonda da bulunan öğeleri-ortak) bulmak için kullanılır. onu da o set in icine atar.

        lhset.retainAll(hset);
        System.out.println("lhset = " + lhset);

        //treeset nasil olusturulur


        TreeSet<String> tset = new TreeSet<>(Arrays.asList("alli","saban","deniz","fatih"));
        System.out.println(tset);
        tset.add("alli");
        System.out.println("tset = " + tset);

        //---------------------------
        //subset() belirli bir aralıktaki elemanları içeren yeni bir küme oluşturmak için kullanılır.
        //subSet() methodu, belirtilen aralıkta bulunan elemanlardan oluşan bir sorted set alt kümesi
        // oluşturur. Bu nedenle, subSet() yöntemini kullanmak için,
        // SortedSet türünden bir değişken oluşturmanız gerekir.subSet(fromElement, toElement) metodu,
        // belirtilen başlangıç elemanı (fromElement) dahil, ancak bitiş elemanı (toElement)
        // hariç olacak şekilde bir alt küme döndürür.
        TreeSet<String> ts = new TreeSet<>(Arrays.asList("A","G","R","U","Z"));

        //TreeSet<Character> ss = ts.subSet('G', 'U');

        SortedSet<String> ss = ts.subSet("G", "U");
        System.out.println(ss);

        SortedSet<String> ss1 = ts.subSet("B", "H");
        System.out.println(ss1);


    }
}
