package day16DateTimeStringBuilder;

public class StringBuilder01 {
    public static void main(String[] args) {
        //Immutable - Degistirilemez
        //Bir String variable olusturup, sonra ona baska String degerleri concatenate ettiginizde,
        // her seferinde Heap Memory’de yeni bir String objesi olusur. Orjinal deger degismez.

        String s ="java";


            //        1) "StringBuilder" class'da String ureten bir class'tir.
            //        2) String class kullanarak String üretiriz, Java nicin StringBuilder'i da olusturdu?
            //        String class "immutable" (degistirilemez) String uretir,
            //                StringBuilder class "mutable"(degistirilebilir) String üretir.
            //        3) "immutable" olmak demek orjinal degerin korunmasi, değistirilemez olmasi demektir
            //        "mutable" olmak demek orjinal degerin değistirilebilir olmasi demektir
            //        4) Bu nedenle, metin üzerinde sık sık ekleme, çıkarma veya değişiklik yapmanız gereken durumlarda
            //        StringBuilder kullanmak, daha verimli ve performanslı bir seçenek olabilir.
            //        5)StringBuilder, metin verilerini eklemek, çıkarmak, değiştirmek veya döndürmek için çeşitli yöntemler
            //        ve işlevler içerir. Bunlar arasında append, delete, insert, replace gibi sık kullanılan metotlar bulunur.
            //                */
            //        StringBuilder b = "Ali"; HATA

        StringBuilder sb = new StringBuilder("ALP");
        sb.append(12);
        System.out.println("sb = " + sb);

        //Peki, bir String’i degistirdikten sonra tekrar ayni String’e yuklersem orjinal deger degismez mi?









    }
}
