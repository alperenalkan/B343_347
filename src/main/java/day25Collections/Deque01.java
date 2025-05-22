package day25Collections;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Deque01 {
    //-------------------------
    //Deque (Double-Ended Queue), hem başından hem de sonundan eleman eklemeye
    // ve çıkartmaya izin veren bir veri yapısıdır.
    // Deque, FIFO (first in first out) veya LIFO (last in first out) olarak sıralanabilir.

        //Java'da deque'ler, Deque interface'iyle temsil edilir. Deque arabirimini uygulayan en yaygın class'lar
    // ArrayDeque ve LinkedList sınıflarıdır.

    public static void main(String[] args) {

        //Deque nasil olusturlur

        Deque<String> dq = new LinkedList<>(Arrays.asList("Fatih","Mahmut","Kerem","Ekrem","Oya","Tansu"));
        System.out.println(dq);

        Deque<String> dq1 = new ArrayDeque<>(dq);
        System.out.println(dq1);

        //2) addFirst(E e): Deque'in başına bir öğe ekler. Dönüş türü void'dir çünkü
        // sadece eklemeyi gerçekleştirir ve değer döndürmez.

        dq.addFirst("Ali");
        System.out.println(dq);

        for (String w : dq){
            System.out.println(w);
        }

        System.out.println("---------------------------");

        //3) addLast(E e): Deque’nin sonuna bir öğe ekler. Dönüş türü yine void’dir.

        dq.addLast("Alperen");
        System.out.println(dq);

        System.out.println("---------------------------");

        //4)removeFirst(): Deque’nin başındaki öğeyi kaldırır ve kaldırılan öğeyi döndürür.
        // Bu method E türünde bir değer döndürür.(Burda String)
        System.out.println(dq);
        dq.removeFirst();
        System.out.println(dq);
        dq.removeLast();
        System.out.println(dq);
        System.out.println("---------------------------");











    }
}
