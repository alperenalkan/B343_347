package day21OOP;

public class Cat extends Mammal {
    public void meow(){
        System.out.println("Cats meow");
    }
    @Override
    public void eat() {
        System.out.println("Cat eats fish");
    }

    @Override
    public void feedWithMilk() {
        System.out.println("Cats feed their babaies with milk");
    }

    @Override
    public void drink() {
        System.out.println("Cats drink milk");
    }
}
