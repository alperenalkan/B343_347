package day26MapsExceptions;

import java.util.HashMap;
import java.util.Map;

public class Maps02 {
    public static void main(String[] args) {

        HashMap<String,Integer> stdAges = new HashMap<>();
        stdAges.put("Ali", 18);
        stdAges.put("Can", 19);
        stdAges.put("Tom", 33);
        stdAges.put("Veli", 63);
        stdAges.put("Ahmet", 41);

        System.out.println(stdAges); //{Can=19, Ahmet=41, Tom=33, Veli=63, Ali=18}

        stdAges.put("Tom",35); //best practise degil önerilmez

        System.out.println(stdAges); //{Can=19, Ahmet=41, Tom=35, Veli=63, Ali=18}

        System.out.println("-------------------------");

        //1) replace() methodu, value'lari key'leri kullanarak update etmeye yarar
        //Aynı işlemi put ile yapmak da teknik olarak işe yarar, ancak replace kullanmak,
        // kodunuzu okuyan diğer geliştiricilere ve size daha net bilgi verir.

        stdAges.replace("Tom",30); //bu sekilde degistirlmeliyiz value lari

        System.out.println("-------------------------");
        //2) replace() methodu, eski deger kontrolu yaparakta calisir
        stdAges.replace("Tom",30,50);
        System.out.println(stdAges);

        System.out.println("-------------------------");

        //3)putIfAbsent() metodu, belirtilen key ve value çiftini, key Map'te yoksa Map'e ekler.
        // Key Map'te zaten varsa, metodun hiçbir etkisi olmaz.

        stdAges.putIfAbsent("Tom",456); //key oldugu icin bisey degismedi vakue farkli olmasina ragmen
        System.out.println(stdAges);
        stdAges.putIfAbsent("Osman",76);
        System.out.println(stdAges); //{Can=19, Ahmet=41, Tom=50, Veli=63, Osman=76, Ali=18} olmadigi icn eklendi

        System.out.println("-------------------------");

        //4- get() ve getOrDefault() method’lari eger aranan eleman map’te var ise, ikisi de ayni isi yapar
        //key verirsiniz, size value verir. Ancak getOrDefault() metodu, anahtar bulunamadığında
        // bir varsayılan değer sağlama avantajına sahiptir.

        System.out.println(stdAges.get("Tom")); //45
        System.out.println(stdAges.get("tom")); //null

        System.out.println(stdAges.getOrDefault("Tom",18)); //50
        //Tom map te var map teki degeri geldi.

        System.out.println(stdAges.get("Jerry")); //null mapte yok
        System.out.println(stdAges.getOrDefault("Jerry",-1)); //-1  mapte yok ama map e eklenmedi
        System.out.println(stdAges); //{Can=19, Ahmet=41, Tom=50, Veli=63, Osman=76, Ali=18}

        System.out.println("-------------------------");
        //5)containsKey() metodu, Map’te bir key olup olmadığını kontrol eder.
        //containsValue() metodu ise, Map’te bir value olup olmadığını kontrol eder.
        //Boolean return ederler

        System.out.println(stdAges.containsValue(19)); // var true
        System.out.println(stdAges.containsKey("Tom")); // var true

        //----------------Buyuk kucuk duyarsiz yapmak

        Map<String, Integer> stdAges2 = new HashMap<>();
        stdAges2.put("Tom".toLowerCase(),25);
        System.out.println(stdAges2);

        boolean b1 = stdAges2.containsKey("TOM".toLowerCase());
        System.out.println(b1);

        System.out.println("-------------------------");
        //6)remove(); methodu key kullanarak entry silmeye yarar

        stdAges.remove("Tom");
        System.out.println(stdAges);

        //remove(“Can”,19); seklinde kullanilan method, hem key hemde value’yu kontrol eder eslesirse siler yoksa silmez
        stdAges.remove("Can",19);
        System.out.println(stdAges); //{Ahmet=41, Veli=63, Osman=76, Ali=18}

        System.out.println("-------------------------");




















    }
}
