package day25Collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {
    /* Java'da Queue, verilerin belirli bir düzen içinde saklandığı ve işlendiği bir veri yapısıdır.
    Ilk giren ilk çıkar (FIFO-first in first out) prensibine dayanır, yani ilk eklenen obje ilk çıkarılır.
    Queue, sıralı işlemler ve verilerin işlenmesi için kullanılır. Araya eleman eklemek mümkün değildir.

    Gerçek dünyadan birkaç örnek:
 Sıra Kuyruğu (Queue): Sıra bekleyenlerin önünde olan kişi önce hizmet alır. Bir örnek olarak,
     bir fast-food restoranındaki siparişlerin işlenmesini düşünebilirsiniz.
     İlk gelen sipariş, ilk hazırlanan ve teslim edilen sipariştir.
 Bilet Sırası: Bir konser veya etkinlik için bilet almak isteyen kişiler sıraya girerler.
     Biletler, sırayla satılır ve ilk gelen kişi ilk biletini alır.
 Çağrı Sırası: Müşteri hizmetleri çağrı merkezindeki müşteriler, sırayla operatörlere bağlanır.
     İlk çağrı bekleyeni önce konuşur, ardından sıradaki çağrı alınır.
 Dosya İşleme: Bilgisayar işletim sistemleri ve uygulamalar, dosyaları sırayla işlerler.
     Bir dosya işlem tamamlandığında, sıradaki dosya işlenir.

Kuyruğun çalışma mantığı, elemanların kuyruğun sonuna eklenip başından çıkarılması şeklinde gerçekleşir.
Queue, sıralı işlemler veya veriler gerektiğinde kullanışlıdır.

Queue interface'i, LinkedList ve PriorityQueue gibi farklı class'lar tarafından uygulanabilir.*/
    public static void main(String[] args) {
        Queue<String> storage = new LinkedList<>();
        storage.add("süt");
        storage.add("et");
        storage.add("yumurta");
        storage.add("peynir");

        System.out.println("storage = " + storage);

        //2) remove(): Kuyruğun başındaki öğeyi kuyruktan kaldırır ve döndürür.
// Kuyruk boşsa bir istisna fırlatır.

        String s = storage.remove();
        System.out.println(s);
        System.out.println(storage);

        //3)peek(): Kuyruğun başındaki öğeyi döndürür, kuyruk boşsa null döner.
        System.out.println(storage.peek());
        System.out.println(storage);

        //4)clear() metodu, kuyruğun içindeki tüm öğeleri kaldırır, böylece kuyruk boş bir duruma gelir.
        storage.clear();
        System.out.println(storage);

        //5)poll(): Kuyruğun başındaki öğeyi kuyruktan kaldırır ve döndürür. Kuyruk boşsa null döner.

        //6)element(): Kuyruğun başındaki öğeyi döndürür, ancak kuyruk boşsa bir istisna fırlatır.
        //System.out.println(storage.element()); hata firlatir cünkü queue nin ici bos

        //-------------------------
        // PriorityQueue (oncelik kuyrugu), bir FIFO (first in first out) yapısı ile nesneleri
        // öncelik sırasına göre sıralayan bir kuyruk (Queue) aracıdır.
        // Yani, en yüksek önceliğe sahip olan nesne, her zaman ilk olarak çıkar.

        //Örneğin, sayıları içeren bir PriorityQueue kullanıyorsanız,
        // sayılar kendi doğal sıralamalarına göre önceliklendirilir.

                //Gerçek hayattan bir örnek olarak, bir hastanedeki hastaların acil servise giriş sırası
        // priorityQueue olarak temsil edilebilir. Hastalar, aciliyet derecelerine göre sıralanır.
        // Aciliyeti en yüksek olan hasta, her zaman ilk olarak tedavi edilir.

        //Nasil olusturuulr

        PriorityQueue<String> emergencyQueue = new PriorityQueue<>();

        emergencyQueue.add("Mehmet");
        emergencyQueue.add("Mahmut");
        emergencyQueue.add("Ekrem");
        emergencyQueue.add("Oya");
        emergencyQueue.add("Tansu");
        System.out.println(emergencyQueue);





    }
}
