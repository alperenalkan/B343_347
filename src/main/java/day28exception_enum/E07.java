package day28exception_enum;

public class E07 {
    //Exception olustugunda bunu ilan eder ve geri cekilirsiniz, buna da throw exception denir.
    // try-catch kullanmazsiniz.Burda programin durmasi kesinlikle isteniyordur.
    public static void main(String[] args) {
        printAge(-4);
    }

    public static void printAge(int age) {
        if (age<0){
            throw new IllegalArgumentException("Yas negatif olamaz");
        }else {
            System.out.println(age);
        }
    }
}
