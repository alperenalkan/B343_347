package day16DateTimeStringBuilder;

public class StringBuilder02 {
    //capacity() methodu, bir StringBuilder veya StringBuffer nesnesinin mevcut kapasitesini verir.
// Buradaki “karakter” kavramıyla kastedilen şey, Java’daki char veri tipindeki karakterlerdir.
// char veri tipi, Java’da Unicode karakterleri temsil etmek için kullanılır ve
// her bir char 2 byte (16-bit) yer kaplar
    public static void main(String[] args) {
        StringBuilder sb2 = new StringBuilder();
        System.out.println("sb2 = " + sb2.length());
        System.out.println(sb2.capacity()); //16

        sb2.append("Java");
        sb2.append("xxxxxxxxxxxxxxxxxxxx");
        System.out.println(sb2.length());
        System.out.println(sb2.capacity()); // 16 nin (2 katiin 2 fazlasi)

/*capacity Java'nin size verdigi data depolama yer sayisidir,
length ise size verilen data depolama yerinin kullanilan kismidir

Java  baslangic olarak size capacity 16 olarak verir,
Siz eger verilen bu capacity'i asarsaniz Java yeni capacity'i var olanin 2 katinin 2 fazlasi olacak sekilde ayarlar
16==> 16*2+2 = 34,  34 ==> 34*2+2 = 70  …..*/

//Default Capacity'yi (16 karakter) nasil degistirebiliriz?


        StringBuilder sb3 = new StringBuilder(3);
        System.out.println(sb3.append("Alis"));
        System.out.println(sb3.capacity());//3 //Alis yazarsak 3 * 2 + 2 = 8 olur

        StringBuilder sb4 = new StringBuilder();
        sb4.append("Java");
        System.out.println(sb4.length()); // 4
        System.out.println(sb4.capacity()); //16

        sb4.append("xxxxxxxxxxxxxxxxxxxx");
        System.out.println(sb4.length()); // 24
        System.out.println(sb4.capacity()); //34

        //1-reverse(): StringBuilder Object’inin içeriğini ters çevirir.String class’ta yoktu

        StringBuilder sb6 = new StringBuilder("Java is easy");

        //1-reverse(): StringBuilder Object'inin içeriğini ters çevirir.String class'ta yoktur

        System.out.println(sb6); //Java is easy

        sb6.reverse();
        System.out.println(sb6); //ysae si avaJ

        //2- deleteCharAt(int index): Belirtilen konumda(index’te) bulunan karakteri siler.

//        sb6.deleteCharAt(1);
//        System.out.println(sb6); //yae si avaJ

        //4-replace(int start-dahil, int end-haric, String str): Belirtilen indexteki karakterleri verilen stringle değiştirir

//        sb1.replace(0, 2, "hasan");
//        System.out.println(sb1); //hasansi avaJ

        //5-insert(int offset, String str): Belirtilen konumdan itibaren verilen stringi ekler.
        // Buradaki offset, eklemenin başlayacağı konumu belirtir ve aslında bir index görevi görür.

        //6-compareTo() metodunun görevi, iki StringBuilder Objesini karşılaştırmaktır.
// int değeri döndürür.Sozluk gibidir.Eğer iki StringBuilder nesnesi birbirine eşitse, 0 döndürür.
// Eğer birinci StringBuilder nesnesi ikinci StringBuilder nesnesinden önce geliyorsa, negatif deger döndürür.
// Eğer birinci StringBuilder nesnesi ikinci StringBuilder nesnesinden sonra geliyorsa, pozitif deger döndürür.
// Farkli olan iki harfin ascii kodlari arasindaki farki verir.
// Ornegin; Bu sifir ve birler if'ler icerisinde kullanilarak iki Object arasindaki iliski belirlenmis olur.
// Kelimelerin sözlük sıralamasını belirleyebilirsiniz, kelimeleri alfabetik sıraya göre sıralayabilirsiniz.

//        sb1.insert(2, "34");
//        System.out.println(sb1); //ha34sansi avaJ










    }
}
