package day25Collections;

import java.util.ArrayDeque;
import java.util.Arrays;

public class ArrayDeque01 {

    //ArrayDeque, Java'da çift yönlü kuyruk (double-ended queue) yapısını temsil eder (verilerini bir dizi (array) içinde saklar) ve Deque arayüzünü uygular.
    // Bu yapı, hem baştan hem sondan ekleme ve çıkarma işlemlerine izin verir.
    // ArrayDeque, LinkedList'e kıyasla daha yüksek performans sunar çünkü içerikleri için dizi tabanlı
    // bir yapı kullanır.ArrayDeque, başta ve sonda hızlı ekleme/çıkarma işlemleri için idealdir.

    public static void main(String[] args) {

        //ArrayDeque nasil olusturulur

        ArrayDeque<String> ardq = new ArrayDeque<>(Arrays.asList("ilk","Fatih","Mahmut","Kerem","Ekrem","Oya","Tansu","son"));
        System.out.println(ardq);

        //ODEV: ArrayDeque’de belirli bir indekse veya araya doğrudan eleman eklemek için bir metod bulunur mu?

//        ArrayDeque sınıfı, çift uçlu kuyruk (deque = double-ended queue) yapısıdır ve şu işlemler için optimize edilmiştir:
//        Baştan ekleme: addFirst(E e)
//        Sona ekleme: addLast(E e) veya add(E e)
//        Baştan çıkarma: removeFirst()
//        Sondan çıkarma: removeLast()
//        Bu sınıf, rastgele erişim (random access) veya belirli indekse ekleme/silme için tasarlanmamıştır. Bu tür işlemler ArrayList veya LinkedList gibi veri yapılarında desteklenir.
//
        //Eleman Çıkarma:
        //removeFirst(): Kuyruğun başından bir eleman çıkarır.
        //removeLast(): Kuyruğun sonundan bir eleman çıkarır.

        ardq.removeFirst();
        System.out.println(ardq);
        ardq.removeLast();
        System.out.println(ardq);









    }
}
