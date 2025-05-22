package day25Collections;

import java.util.HashSet;
import java.util.TreeSet;

public class Sets02 {
    public static void main(String[] args) {
        //Interview Sorusu
        //Ornek 1 : Ogrenci email adreslerini natural order'da siralanmis olarak depolayiniz.
        //Interview Question
        //Example 1 : Store student email addresses in natural order.

        //------------------------------
        //1.yol - Yavas, her elemanda siralama yapar

        long t1 = System.nanoTime();

        TreeSet<String> emails = new TreeSet<>();
        emails.add("k@gmail.com");
        emails.add("a@gmail.com");
        emails.add("h@gmail.com");
        emails.add("d@gmail.com");
        emails.add("v@gmail.com");
        emails.add("g@gmail.com");
        emails.add("y@gmail.com");
        emails.add("b@gmail.com");
        emails.add("n@gmail.com");
        emails.add("m@gmail.com");
        System.out.println("emails = " + emails);

        long t2 = System.nanoTime();

        System.out.println("t2 t1 süre farki  " + (t2-t1));
        //----------------------------
        //TreeSet'ler cok yavas, en hizli olandan yardim alalim (HashSet)

        //2.yol daha hilzi
        long t3 = System.nanoTime();

        HashSet<String> emailshs = new HashSet<>();
        emailshs.add("k@gmail.com");
        emailshs.add("a@gmail.com");
        emailshs.add("h@gmail.com");
        emailshs.add("d@gmail.com");
        emailshs.add("v@gmail.com");
        emailshs.add("g@gmail.com");
        emailshs.add("y@gmail.com");
        emailshs.add("b@gmail.com");
        emailshs.add("n@gmail.com");
        emailshs.add("m@gmail.com");
        System.out.println("emails = " + emailshs);

        //Bos bir TreeSet olusturalim ve constructor'ina HashSet'i verelim ki natural siralama yapsin

        TreeSet<String> emailsHsTs = new TreeSet<>(emails);
        System.out.println("emailsHsTs = " + emailsHsTs);

        long t4 = System.nanoTime();
        System.out.println("t3 t4 süre farki  " + (t4-t3));


    }
}
