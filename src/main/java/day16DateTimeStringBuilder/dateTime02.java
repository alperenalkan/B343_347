package day16DateTimeStringBuilder;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Scanner;

public class dateTime02 {
    public static void main(String[] args) {
        //ornek 1: Kullanicidan aldiginiz tarih gecmise ait ise “Gecersiz tarih girdiniz” mesaji veriniz.
        //Kullanicidan aldiginiz tarih gelecege ait ise “Zamani girebilirsiniz” deyiniz.
        //Example 1: If the date you have received from the user is in the past, give the message “You have entered an invalid date”.
        //If the date you have received from the user is in the future, say “You can enter the time”.

        Scanner scanner = new Scanner(System.in);
        LocalDate currentDate = LocalDate.now();
        LocalDate givenData = null;
        while (true) {

            System.out.println("Lütfen yili giriniz");
            int year =scanner.nextInt();

            System.out.println("Lütfen ayi giriniz");
            int month =scanner.nextInt();
            if (month<1 || month>12){
                System.out.println("12 ay icinde bir ay giriniz");
                continue; //döngünün basina döndürür
            }
            System.out.println("Lütfen günü giriniz");
            int day = scanner.nextInt();
            scanner.nextLine();

            YearMonth yearMonth = YearMonth.of(year,month);

            //Ayin maksimum gun sayisini bulalim
            int daysInMonth =yearMonth.lengthOfMonth();

            if (day<1 || day>daysInMonth){
                System.out.printf("girilen ay icin gecersiz gün tekrar deneyiniz");
                continue;
            }
            givenData = LocalDate.of(year,month,day);
            System.out.println(givenData);

            if (givenData.isBefore(currentDate)){
                System.out.println("gecersiz, gecmis bir tarih girdiniz");
                continue;
            }else {
                System.out.println("zamani girebilisiniz");
                break;
            }



        }

    }

}
