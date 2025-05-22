package day20OOP2;

public class Honda extends Car {
    public Honda() {
        super();
        System.out.println("Civic");
    }

    public Honda(String model) {
        super("Sport");
        System.out.println(model);
    }
}
