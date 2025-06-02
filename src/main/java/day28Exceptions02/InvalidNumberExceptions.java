package day28Exceptions02;

public class InvalidNumberExceptions extends RuntimeException{
    //Bir okuldaki ogrenci sayisi negatif olamaz senaryosu uzerinden gidelim.
    //Let's go through the scenario that the number of students in a school cannot be negative

    public InvalidNumberExceptions(String message) {
        super(message);
    }
}
