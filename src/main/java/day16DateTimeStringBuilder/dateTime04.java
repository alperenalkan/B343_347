package day16DateTimeStringBuilder;

import java.time.LocalDate;
import java.time.Period;

public class dateTime04 {
    //Java'da Period class'i, tarihler arasındaki yıl, ay ve gün farklarını temsil etmek için kullanılır.

//Kullanım Alanları
//Period sınıfı, özellikle tarihler arasındaki uzun süreli farkları hesaplamak, tarihleri manipüle etmek
// veya tarihler arası geçiş sürelerini yönetmek için kullanışlıdır. Finans, sağlık, eğitim gibi alanlarda
// ve tarih ile ilgili işlemlerin sık yapıldığı her türlü yazılım geliştirme projelerinde etkili bir araçtır.

    //Period.between() metodu, iki tarih arasındaki farkı hesaplamak için kullanılır.
// Bu metod, başlangıç ve bitiş tarihleri arasındaki tam yıl, ay ve gün farkını bir Period objesi olarak döndürür.
    public static void main(String[] args) {

        LocalDate date1 = LocalDate.of(1997,1,1);
        LocalDate date2 = LocalDate.of(2010,5,18);

        Period difference = Period.between(date1,date2);
        //P13Y4M17D

        int yearDifference = difference.getYears();
        int monthDifference = difference.getMonths();
        int dayDifference = difference.getDays();

        System.out.println(date1 +" ve "+ date2 + " arasindaki fark:");
        System.out.println("yil: "+ yearDifference);
        System.out.println("ay: "+monthDifference);
        System.out.println("gün: "+dayDifference);




    }
}
