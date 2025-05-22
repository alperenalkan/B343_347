package day25Collections;

public class A extends B{
    public static void main(String[] args) {

        B b = new B();
        b.m();
        System.out.println(b.x);



        C c = new B();
        c.m();
        System.out.println(c.x);



        C d = new C();
        d.m();
        System.out.println(d.x);
    }
}
