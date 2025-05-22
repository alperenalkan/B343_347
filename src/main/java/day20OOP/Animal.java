package day20OOP;

public class Animal {
    //OOP (Object Oriented Programming -  Nesne Tabanlı Programlama)
//Gerçek hayatta gördüğümüz birçok Object'in (nesnenin) bilgisayar ortamına aktarılma şeklidir.
//Yani bir object'in rengi, durumu, ismi, üretim yılı gibi birçok özelliklerin bilgisayar
// ortamında gösterilmesi buna örnek olarak verilebilir.
    /*Object Yönelimli Programlamanın Faydaları:
1) Object oluşturma bir Class içerisinde toplanır ve tüm projelerde kullanılabilirliğe olanak sağlar.(String gibi)
2) Class'larin 1 kez oluşturulması sayesinde uzun kodları tekrardan yazmak yerine kısa kodlamalar
ile çalıştırılabilir. Substring() method'u 1 kere yazilmis ama surekli kullanabiliyoruz.
3) Uzun kodların tekrar yazılmasının engellenmesi sayesinde geliştirme süreci kısalır.
4) Object'ler birbirinden bağımsız olduğundan bilgi gizliliği konusunda avantaj sağlar.
5) Class'lar sayesinde tüm projelerde değişiklik yapmak yerine tek bir class' ta değişiklik
yapılıp tüm projelerde çalışması sağlanır. Bu zaman kaybını büyük ölçüde azaltır.*/

    /* OOP'leri 4 temel özellikte inceleyebiliriz.
1. Inheritance - Miras Alma
2. Polymorphism - Çok Biçimlilik
3. Encapsulation - Kapsülleme
4. Abstraction - Soyutlama
*/
    // Java'da parent'tan child'a olan iliskilere HAS-A Relationship denir
// Java'da child'tan parent'a olan iliskilere IS-A Relationship denir


    public void eat(){
        System.out.println("Amnimals eat...");
    }
    public void drink(){
        System.out.println("Animals drink...");
    }
}
