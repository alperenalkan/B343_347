package day17StringBuilder;

public class Student1 {
    public static String ID = "Ali Can"; //ststic variable

    public  int age = 23;

    public static void  staticMethod(){
        System.out.println("static methodum");
    }

    public  void  nonstaticMethod(){
        System.out.println("non static methodum");
    }

    static {
        System.out.println("ben bir statik blogum");
    }
}
