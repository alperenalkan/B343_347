package day20OOP;

public class Cat extends Mammal {
    public void meow(){
        System.out.println("Cats meow");
    }
    @Override
    public void eat() {
        System.out.println("Cat eats fish");
    }

    @Override
    public void drink() {
        System.out.println("Cats drink milk");
    }
}
