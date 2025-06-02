package day29Lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda03 {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Ali");
        myList.add("Elif");
        myList.add("Yusuf");
        myList.add("Elif");
        myList.add("Zeynep");
        myList.add("Mustafa");

        printElementsExceptStartsWithE(myList);


    } //main disi

    //-----------------------
    //ornek 1: Bir listedeki "E" harfiyle başlamayan tüm öğeleri konsola yazdıran bir yöntem oluşturun.
    //example 1: Create a method that prints to the console all items in a list that
    // do not start with the letter "E".

    public static void printElementsExceptStartsWithE(List<String> myList) {
        myList.
                stream().
                filter(t -> !t.startsWith("E")).
                forEach(t -> System.out.print(t + " ")); //Ali Yusuf Zeynep Mustafa

    }

    //-----------------------
    //ornek 2: Bir List<String> içinde karakter sayısı 5'ten az olan tüm benzersiz
    // (tekrarsız) elemanları konsola yazdıran bir metod yazınız.
    //example 2: Write a method that prints all unique (non-repetitive) elements with
    // less than 5 characters in a List<String> to the console.




}
