package day25Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {
     //9)) kooleksiyounun basindaki elemani alir ve kaldirir
    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList<>(Arrays.asList("ali","veli","alperen","sengül"));
        myList.poll();
        System.out.println(myList);

        //10) element() metodu, bir koleksiyonun başındaki elemanı alır, ancak elemanı koleksiyondan kaldırmaz.
        // Bu metod, koleksiyon boşsa NoSuchElementException istisnası atar. (peek() null dondurur)
        // bir koleksiyonun    boş olup olmadığını kontrol etmek için NoSuchElementException istisnasını kullanir

        System.out.println(myList.element()); //Zeynep
        System.out.println(myList); //[Zeynep, Veli, Ayse, Fatma, Huseyin]

        //11) pop() metodu, bir koleksiyonun ilk elemanını alır ve koleksiyondan kaldırır.
        // Bu metod, koleksiyon boşsa NoSuchElementException istisnası atar.(poll() null dondurur)

        System.out.println(myList.pop());
        System.out.println(myList);




    }
}
