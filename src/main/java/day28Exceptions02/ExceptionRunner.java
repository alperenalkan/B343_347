package day28Exceptions02;

public class ExceptionRunner {
    /*Java'da final, finally ve finalize() terimleri farklı amaçlarla kullanılan üç farklı kavramı temsil eder.

	final:
    Değişkenler İçin: final keyword'uyle tanımlanan bir variable sadece bir kez değer alabilir.
    Bu, değişkenin değerinin sonradan değiştirilemeyeceği anlamına gelir. Yani, bu değişken sabittir (constant)
    Metotlar İçin: final keyword'uyle tanımlanan bir metot, child class'lar tarafından
    override edilemez.
    Class'lar İçin: final keyword'uyle tanımlanan bir class, genişletilemez (extends edilemez).
    Yani bu class'in child'i olmaz.

	finally:
    finally bloğu, try-catch yapısının bir parçasıdır. Bu blok, try bloğunda bir istisna oluşsa da
    oluşmasa da her zaman çalıştırılır.Genellikle kaynakların serbest bırakılması,
    dosyaların kapatılması gibi temizleme işlemleri için kullanılır.

	finalize():
    Bu, Object sınıfında tanımlanan bir metottur ve varsayılan olarak hiçbir işlem yapmaz.
    Bir nesne bellekten kaldırılmadan hemen önce Garbage Collector (Çöp Toplayıcı) tarafından
    otomatik olarak çağrılır. Genellikle dış kaynakların serbest bırakılması için kullanılır,
    ancak modern Java uygulamalarında kullanımı önerilmez.*/

    public static void main(String[] args) {
        numberOfStudent(-56);
    }

    public static void numberOfStudent(int sayi){
        if (sayi<0){
            try {
                throw new InvalidNumberExceptions("ögrenci sayisi 0 dan az olamaz");
            } catch (InvalidNumberExceptions e) {
                e.printStackTrace();
            }
        }else {
            System.out.println(sayi);
        }
        System.out.println("throwdan sonra calisti cünkü catch var");
    }
}
