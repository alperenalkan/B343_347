package day20OOP2;

public class Car  extends Vehicle{

    public Car() {
        super();
        System.out.println("Sedan");
    }
    public Car(String type) {
        super("Honda",2024,"Elektrikli");
        System.out.println(type);
    }
}
