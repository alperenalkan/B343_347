package day16DateTimeStringBuilder;

import java.time.LocalDate;
import java.util.Scanner;

public class dateTime03 {
    public static void main(String[] args) {
        //ornek 1:  Kullanicidan dogum tarihini alan ve girdigi tarihin gun ismini bulan kodu yaziniz.
        //example 1: Write the code that takes the date of birth from the user and finds the day name of the date entered.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen dogum tarihini giriniz yil-ay-gün");
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        LocalDate dogumTarihi = LocalDate.of(year,month,day);
        LocalDate today = LocalDate.now();
        System.out.println(dogumTarihi.getDayOfWeek());



       }
    }

