package day17StringBuilder;

public class InstanceBlock3 {
    //Ornek 3: Bir araba fabrikasinda her araba siyah renkli ve yakit tipi benzin olsun.

//Example 3: In a car factory, each car is black in colour and the fuel type is petrol.

//(Bunlar ortak ozellikler. Digerleri sonra ayarlansin)

    public String color;
    public String fuelType;

    //instance block classtan her obje üretildiginde calisir.
    {
        color ="siyah";
        fuelType ="Bnezin";

    }

    public InstanceBlock3() {
        System.out.println("Araba rengi: "+ color);
        System.out.println("Araba yakit türü: "+ fuelType);
    }

    public InstanceBlock3(String fuelType, String color) {
        this.fuelType = fuelType;
        this.color = color;
    }
}
