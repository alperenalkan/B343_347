package day26MapsExceptions;

import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class Maps04 {
    /*
    Thread Safe: Aynı anda birçok iş parçacığı tarafından güvenli bir şekilde erişilebilen yapılar.
    Veri yarışlarını ve tutarsızlıkları önler.
    Multi Thread: Aynı anda birden fazla iş parçacığı tarafından çalıştırılabilen programlar.
    Paralel işleme ve performans artışı sağlar.
    Synchronized: Aynı anda sadece bir iş parçacığı tarafından erişilebilen metodlar veya kod blokları.
    Eşzamanlılık sorunlarını ve veri tutarsızlıklarını önler.
    */

    /*HashMap, HashTable ve ConcurrentHashMap arasindaki fark nedir?
    1- HashMap
    a) Thread Safety:
    Thread-safe değildir.
    Çok iş parçacıklı (multi-threaded) ortamda veri tutarsızlıkları olabilir.
    b) Multi Thread:
    Tek iş parçacıklı (single-threaded) ortamlar için idealdir.
    Çok iş parçacıklı ortamlar için harici senkronizasyon gerektirir.
    c) Synchronized:
    Synchronized değildir, yani aynı anda birden fazla iş parçacığı tarafından erişilebilir.
    d) Null Key/Value:
    Bir null key ve birden fazla null value kabul eder.
    e) Performans:
    En hızlısıdır çünkü synchronized değildir.
     */

    /*
    2- Hashtable
    a) Thread Safety:
    Thread-safe'tir.
    Synchronized yapısı nedeniyle aynı anda sadece bir iş parçacığı tarafından kullanılabilir.
    b) Multi Thread:
    Çok iş parçacıklı (multi-threaded) ortamlar için uygundur.
    c) Synchronized:
    Synchronized'dir, yani tüm metotlar synchronized olarak işaretlenmiştir ve aynı anda sadece bir iş parçacığı tarafından erişilebilir.
    d) Null Key/Value:
    Ne null key ne de null value kabul eder. NullPointerException atar.
    e) Performans:
    HashMap'ten daha yavaştır çünkü synchronized'dir*/

    /*
    3- ConcurrentHashMap
    a) Thread Safety:
    Thread-safe'tir.
    Segment-based locking kullanarak senkronizasyon sağlar.
    b) Multi Thread:
    Çok iş parçacıklı (multi-threaded) ortamlar için idealdir.
    Aynı anda birden fazla iş parçacığı tarafından güvenli bir şekilde kullanılabilir.
    c) Synchronized:
    Synchronized'dir, ancak segment-based locking sayesinde daha iyi performans sunar.
    d) Null Key/Value:
    Ne null key ne de null value kabul eder. NullPointerException atar.
    e) Performans:
    HashTable'dan daha hızlıdır çünkü segment-based locking kullanır.
    Çok iş parçacıklı ortamlar için optimize edilmiştir.
    */
    public static void main(String[] args) {


        Hashtable<String,Integer> studentGrades = new Hashtable<>();
        studentGrades.put("Selma", 70);
        studentGrades.put("Tuba", 75);
        studentGrades.put("Ibrahim", 85);
        studentGrades.put("Sefa", 87);
        //studentGrades.put(null,34); //hata
        //studentGrades.put("Ahmet",null); //hata

        HashMap<String,Integer> stdAges = new HashMap<>();
        stdAges.put("Ali", 18);
        stdAges.put("Mehmet", 41);
        stdAges.put(null,56); // hata vermez
        stdAges.put(null,78); //üstüne yazar
        stdAges.put("Ali",null); // hata vermez

        ConcurrentHashMap<String,Integer> stdAges1 = new ConcurrentHashMap<>();
        stdAges.put("Ali", 18);
        stdAges.put("Mehmet", 41);
        stdAges.put(null,56); // hata vermez
        stdAges.put(null,78); //üstüne yazar
        stdAges.put("Ali",null); // hata vermez

        //ayni hashmap gibi ama multi thread ve threadsafe. ve hashtable dan hizlidir.

        ConcurrentHashMap<String,Integer> stock = new ConcurrentHashMap<>();
        stock.put("Elma", 10);
        stock.put("Muz", 20);

        stock.putIfAbsent("Cilek",30);

        stock.replace("Muz", 20, 25);
        System.out.println(stock); //{Muz=25, Elma=10, Cilek=30}

        stock.remove("Elma");
        System.out.println(stock); //{Muz=25, Cilek=30}

        for (Map.Entry<String, Integer> w : stock.entrySet()) {

            String key = w.getKey();
            Integer value = w.getValue();
            System.out.println(key +" stok miktari: "+value);


        }

        /*
        1) TreeMap'ler entry'leri natural order'a gore siraya koyar, bu yuzden yavastirlar
        2) TreeMap'ler  thread-safe ve synchronized degildir.
        3) TreeMap'lerin key'lerinde null kullanilamaz(Comparator istisnasi var ama onerilmez),
        ama value kisimlarinda istediginiz kadar kullanabilirsiniz
        4) TreeMapler key'e bakarak siralama yapar
         */

        TreeMap<String, Integer> countryPopulation = new TreeMap<>();
        countryPopulation.put("Germany", 83000000);
        countryPopulation.put("USA", 400000000);
        countryPopulation.put("Turkiye", 83000000);
        countryPopulation.put("Netherland", 18000000);
        //countryPopulation.put(null,8000000); //hata
        countryPopulation.put("Italy",306666); //kabul eder

        /*LinkedHashMap, HashMap'e benzer, ancak ekleme sırasına göre sıralanmış bir şekilde verileri tutar.
        Yani, LinkedHashMap verileri eklediğiniz sırayla tutar ve bu sırayı korur.
        Bu nedenle, verileri eklediğiniz sırayla geri almanız gerektiğinde kullanışlı olabilir.

        **ornegin,bir takvim uygulamasında, etkinlikleri tarih sırasına göre tutmak için kullanılabilir.
        yada bir restoranın sipariş alım sistemi düşünün. Müşterilerin siparişlerini verme sırası,
        restoranın sipariş hazırlama sırasını belirler.

        Aynı mantık, müşteri hizmetleri çağrı merkezleri, sırayla hizmet veren işletmeler veya
        benzeri senaryolarda da kullanılabilir.
        Müşteri veya işlem sıralarını takip etmek için LinkedHashMap tercih edilebilir.LinkedHashMap sınıfı thread-safe degildir
        */















    }
}
