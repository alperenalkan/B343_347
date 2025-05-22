package day16DateTimeStringBuilder;

public class StringBuilder03 {
    public static void main(String[] args) {

        StringBuilder sb2 = new StringBuilder("Zava");
        StringBuilder sb3 = new StringBuilder("Kava");
        System.out.println(sb2.compareTo(sb3)); // ASCII kod tablosunda ki Z-K degeriniden bu cikar


        StringBuilder sb4 = new StringBuilder("Java");
        StringBuilder sb5 = new StringBuilder("Kava");
        int result = sb4.compareTo(sb5);
        System.out.println(result); //-1

        //7-toString() metodu, StringBuilder nesnesinin içeriğini bir String nesnesine dönüştürür.

        String str = sb2.toString().toUpperCase();
        System.out.println(str);

        //String nasil StringBuilder a cevirilir?
//Cevirmek istedigimiz String’i StringBuilder’in parantezi icine parametre olarak gondeririz

        StringBuilder newsb1 = new StringBuilder(str);
        System.out.println(newsb1);
        //...................

        StringBuffer sbf = new StringBuffer("Java");
        System.out.println(sbf);

    }
}
