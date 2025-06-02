package day28exception_enum;

public class ExceptionRunnner {
    public static void main(String[] args) throws InvalidStudentGradeException {
        studentGrade(-45);


    }//main disi

    public  static void studentGrade(int not) throws InvalidStudentGradeException {
      if (not<0 || not > 100){
          try {
              throw new InvalidStudentGradeException("Ogrenci notu sifirdan kücük veya yüzden büyük girilemz");
          } catch (InvalidStudentGradeException e) {
             e.printStackTrace();
          }

      }else {
          System.out.println(not);
      }
        System.out.println("throwdan sonra calisti cünkü catch var");

    }
}
