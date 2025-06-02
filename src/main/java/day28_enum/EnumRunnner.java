package day28_enum;

import java.util.Scanner;

public class EnumRunnner {
    public static void main(String[] args) {
        Cities cities =Cities.ADANA;
        System.out.println(cities);
        System.out.println(cities.getCityName());
        System.out.println(cities.getPlateCode());
        System.out.println(cities.getPostalCode());

        int plakaKodu = Cities.ANTALYA.getPlateCode();
        System.out.println(plakaKodu);

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen plaka kodunu giriniz");
        int plaka = input.nextInt();

        //values() methodu enum icindeki tum datalari bir Array icinde bize verir

        Cities[] sehirler = Cities.values();
       // System.out.println(sehirler);

        if (plaka < 1 || plaka > 81) {
            System.out.println("Lutfen 1 ile 81 arasi bir plaka kodu giriniz");
        } else {

            for (Cities w : sehirler){
                if (plaka == w.getPlateCode()){
                    System.out.println("Girmis oldugunuz plaka "+ w.getCityName() + " iline aittir");
                    break;
                }
            }

        }

    }
}
