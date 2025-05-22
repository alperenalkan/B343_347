package day17StringBuilder;

import java.time.LocalDate;

public class StaticBlockörnek {
    //Senaryo: Subat ayinda fiyatlarda indirim olacak. Class cagirildiginda otomatik price'i alacak
    // ve class'in heryerinde bu degeri kullanacak.
    //Scenario: There will be a discount on prices in February. The class will get the price automatically when called
    // and will use this value everywhere in the class
    public static String month;
    static  int price;
    static {
        System.out.println("static block");
        LocalDate currentDate = LocalDate.now();

        if (currentDate.getMonthValue()==5){
            price =1000;
            System.out.println("price = " + price);
        }
        else {
            price=2000;
            System.out.println("price = " + price);
        }


    }

    public static void main(String[] args) {


    }
}
