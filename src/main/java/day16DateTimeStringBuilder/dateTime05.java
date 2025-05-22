package day16DateTimeStringBuilder;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class dateTime05 {
    public static void main(String[] args) {
        /*LocalTime Class'ta kullanilan tarih saat formatlari

        HH : mm ==> 24'lu saat sistemi
        hh : mm ==> 12'li saat sistemi. AM, PM gosterilmez
        hh : mm a ==> 12'li saat sistemi. AM, PM gosterilir
        HH : mm : ss ==> saniyeyi gosterir
        HH : MM ==> yanlis format cunku MM aylar icin kullanilir
        "mm" "minute" demektir. "MM" "month" demektir.

        dd-MM-yyyy ==> gun - ay - yil
        MMM ==> Aug
        MMMM ==> August  */
        //-------------
        //ornek 1:"DateTimeFormatter", bir Class'tir ve tarih ve saat verilerini belirli bir
        // biçimde görüntülemek, okumak ve işlemek için kullanılan önemli bir araçtır.

        //DateTimeFormatter, tarih ve saat nesnelerini "metin" yani String olarak biçimlendirmenize ve
        // metni tarih ve saat nesnelerine çözmenize olanak tanır.
        //ofPattern() metodu, belirli bir kalıba (pattern) göre tarih ve zaman verilerini
        // biçimlendirmek için kullanılır.
        //format() method'u LocalTime'i String'e istedigimiz formatta cevirir.

        LocalTime myCurrentTime = LocalTime.now();
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("hh:mm a");

        String formattedTime = dtf1.format(myCurrentTime);
        System.out.println(formattedTime);

        //Ornek 2: Tarih’i formatlayalim

        LocalDate myCurrentDate = LocalDate.now();

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");

        String formattedDate = dtf2.format(myCurrentDate);
        System.out.println(formattedDate);
        //ornek 3: Baska bir zaman dilimindeki tarih ve zamani nasil aliriz?

        //ZoneId class'i, zaman dilimi veya coğrafi bölge bilgisini temsil eder ve
        // tarih/saat işlemlerinde bu bilginin kullanılmasını sağlar.

        LocalDate currentTokyo = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("currentTokyo = " + currentTokyo);

        LocalTime currentTokyo1 = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("currentTokyo = " + currentTokyo1);

        Set<String> zoneIDs = ZoneId.getAvailableZoneIds();

        for (String w:zoneIDs){
            if (w.contains("Europe")){
                //System.out.println("w = " + w);
            }
        }

        //Zmana dilimleini yazdiralim
        System.out.println(zoneIDs.size());

        //---------------
        //ornek 4: Tarih ve zamani ayni anda kullanalim.
        //LocalDateTime, tarih ve saatlerle çalışmak için kullanılır.

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("ldt = " + ldt);

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd * MMM * yyyy - hh : mm a");
        String formattedLdt = dtf3.format(ldt);
        System.out.println(formattedLdt); //08 * May * 2025 - 10 : 27 ÖS








    }
}
