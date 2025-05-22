package day16DateTimeStringBuilder;

import day17StringBuilder.Student;
import day17StringBuilder.Student1;

public class AnotherPackageClass extends Student{
    public static void main(String[] args) {

        Student student2= new Student();
        System.out.println(student2);
        System.out.println(student2.stdName);


        String a = Student1.ID;
    }
}
