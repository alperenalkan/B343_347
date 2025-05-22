package day26Maps;

import java.util.*;

public class Maps01 {
    //1) Map’ler sozluk gibidir. Aciklamalidir. orn: Ali = 13 .Map’ler collections degildir. Ordan miras almaz
    //2) Sol taraf yani key’ler tekrarsizdir. Value tarafi tekrarli olabilir.
    //3) Key tarafi icin Set kullanilir. Values için ise genellikle Collection yapısı kullanılır.
    //4) Map’in elemanlarina komple ‘entry set’ (giris elemani) denir.

    public static void main(String[] args) {
        //Map nasil olusturulur?

        //put():Bir key-value çiftini map’e ekler.

        //1) HashMap: Key-value çiftlerini rastgele bir sırayla depolayan bir Map türüdür.En hizlisidir.

        HashMap<String, Integer> myMap = new HashMap<>();

        myMap.put("Ali Can", 13);
        myMap.put("Veli Han", 18);
        myMap.put("Ayse Kaya", 15);
        myMap.put("Fatma Yilmaz", 19);

        myMap.put("Ali Can",25); //key tekrarli kullanilirsa son value aktif olur

        System.out.println(myMap);
        System.out.println("---------------------------");
        //Sadece ‘key’ degerlerini nasil alabiliriz?

        Set<String> keySide = myMap.keySet();
        System.out.println(myMap.keySet());

        //values():Map’teki tüm value’ların bir collection’ını döndürür.Collection’ın sırası rastgeledir.
        Collection<Integer> values = myMap.values();
        System.out.println(myMap.values());

        System.out.println("---------------------------");

        //get(): Bir key’e karşılık gelen değeri döndürür.key verirsiniz value’sunu getirir
        int alicanvalue = myMap.get("Ali Can"); //büyük kücük harf duyarli
        System.out.println(alicanvalue); //25

        System.out.println("---------------------------");

        //Ornek 1: myMap'deki kisilerin yaslarinin ortalamasi nedir?
        //Example 1: What is the average age of the people in myMap?

        double total =0;
        int kisiSayisi = myMap.size();

       for (int w : myMap.values()){
           total += w;
       }
        System.out.println("ortalama yas: "+ (total/kisiSayisi));

        System.out.println("---------------------------");

        //entrySet() metodu, HashMap'in tüm degerlerini içeren (key-value) bir Set döndürür.
        // Dongu gibi ayri satirlarda yazdirir.Cunku Loop'lar direkt Map'ler ile kullanilamaz.
        //Bu yuzden ozel method gelistirilmis. Set'in icinde Map yapisi saklanir.

        System.out.println(myMap.entrySet());
        //[Fatma Yilmaz=19, Ali Can=25, Veli Han=18, Ayse Kaya=15]

        System.out.println("---------------------------");

        Set<Map.Entry<String,Integer>> myEntrySet = myMap.entrySet();
        // Map.Entry<String, Integer> data type'dir

        for (Map.Entry<String,Integer> w : myEntrySet){
            System.out.println(w);
//            Fatma Yilmaz=19
//            Ali Can=25
//            Veli Han=18
//            Ayse Kaya=15
        }
        System.out.println("---------------------------");

        //Ornek 2: Verilen Map’deki kisi isimlerinin character sayisi ile yaslarinin toplamini bulunuz.
        //Example 2: Find the sum of the number of characters and the age of the person names in the given Map.
        //Java’da Map.Entry kullanarak bir Set üzerinde loop yapabilir ve
        // hem anahtarları (getKey()) hem de değerleri (getValue()) elde edebilirsiniz.

        HashMap<String,Integer> people = new HashMap<>();
        people.put("Ali",3);
        people.put("Can",5);
        people.put("Ayse",2);
        int toplamkarakter =0;
        for ( String w : people.keySet()){
            toplamkarakter += w.length();
        }
        int toplamyas = 0;
        for (int w : people.values()){
            toplamyas +=w;
        }
        System.out.println(toplamkarakter+toplamyas);

        System.out.println("---------------------------");

        //2.yol

        Set<Map.Entry<String,Integer>> mySet = people.entrySet();
        System.out.println(mySet);
        int sum =0;
        for ( Map.Entry<String,Integer> w : mySet){
            sum = sum + w.getKey().length() + w.getValue();
        }
        System.out.println(sum);








    }
}
