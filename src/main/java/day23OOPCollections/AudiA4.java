package day23OOPCollections;

public class AudiA4 implements Engine,AC,Brake{
    @Override
    public void dizel() {

        System.out.println("Dizel motor");

    }

    @Override
    public void benzin() {
        System.out.println("Benzin motor");

    }

    @Override
    public void analog() {
        System.out.println("Analog klima");

    }

    @Override
    public void digtsl() {
        System.out.println("Dijital klima");

    }

    @Override
    public void ABS() {
        System.out.println("ABS var");
    }

    @Override
    public void ASR() {
        System.out.println("ASR var");

    }
}
