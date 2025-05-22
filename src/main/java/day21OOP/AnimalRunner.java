package day21OOP;

public class AnimalRunner {
    public static void main(String[] args) {

        Cat cat1 = new Cat();
        cat1.meow();
        cat1.drink();
        cat1.feedWithMilk();

        System.out.println("----------------");

        Dog dog1 = new Dog();
        dog1.bark();
        dog1.eat();
        dog1.drink();
        dog1.feedWithMilk();

        System.out.println("------------------");

        Bird bird1 = new Bird();
        bird1.tweet();
        bird1.eat();
        bird1.drink();
    }
}
