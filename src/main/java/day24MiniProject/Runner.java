package day24MiniProject;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Runner {
//    1- Uygulama mesafe ve kurallara göre otobüs bileti fiyatı hesaplar sonuç olarak bilet bilgisini verir
//
// 2- Kullanıcıdan mesafe (KM), yolcu adı, yaşı ,  yolculuk tipi (Tek Yön, Gidiş-Dönüş) ve koltuk no bilgilerini alınır.
//            NOT: Koltuk numaraları her otobüs için dinamik olmalıdır.)
//    Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2 olmalıdır. Aksi halde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
//
//            3-Fiyat hesaplama kuralları:
//            -Mesafe başına ücret:
//            Tek yön: 1 Lira / km       Çift Yön(Gidiş-Dönüş): 2 Lira/km
//       -Tekli Koltuk ücreti:
//    Koltuk no 3 veya 3 ün katı ise fiyat %20 daha fazladır(Tek yön: 1.2 Lira/km, Çift Yön:2.4 Lira/km).
//            -İlk olarak seferin mesafe, yön ve koltuk no bilgisine göre fiyatı hesaplanır,
//    sonrasında koşullara göre aşağıdaki indirimler uygulanır ;
//    i)-Çift Yön indirimi:
//            "Yolculuk Tipi" gidiş dönüş seçilmiş ise son bilet fiyatı üzerinden %20 indirim uygulanır.
//    ii)-Yaş indirimi:
//    Kişi 12 yaşından küçükse son bilet fiyatı üzerinden %50 indirim uygulanır.
//    Kişi 65 yaşından büyük ise son bilet fiyatı üzerinden %30 indirim uygulanır.

    public static void main(String[] args) {
       startApplication();
    }

    private static void startApplication() {
        //1-bilet ve otobüs objelerini olusturalim.

        Bus bus1 = new Bus("35 AN 4469",35,"FLIXBUS");

        Ticket ticket;

        Scanner scanner = new Scanner(System.in);
        int select; //eger select 0 ise döngüden cikicak
        do {
            //kullanici bilgileri
            System.out.println("Bilet rezervasyon sistemine hosgeldiniz");
            System.out.println("Lütfen ad-soyad giriniz : ");
            String name = scanner.nextLine();

            System.out.println("Lütfen yaşınızı giriniz : ");
            int age = scanner.nextInt();

            System.out.println("Lütfen gidilecek mesafeyi KM olarak giriniz : ");
            double km = scanner.nextDouble();

            System.out.println("Lütfen yolculuk tipini seçiniz : ");
            System.out.println("1-Tek Yön");
            System.out.println("2-Gidis-Dönüs");
            int type = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Lütfen koltuk no giriniz: ");
            System.out.println("Tekli koltuk ücreti %20 daha fazladir!");
            System.out.println(bus1.getSeats()); //1-35 e kadar yazdirsin
            String seat = scanner.next();

            System.out.println("Yeni islem icin bir sayi giriniz, cikis icin 0 giriniz");
            select = scanner.nextInt();
            scanner.nextLine();

            //girilen koltuk no rezerve edilmis veya otobüste yoksa
            boolean isreserved =  !bus1.getSeats().contains(seat);
            //true: rezerve edilmis
            //false: rezerve edilmemis

            //girilen degerler gecerlimi
            if (age>0 && km>0 && (type ==1 || type==2)){
                //bileti hazirlayalim
                ticket = new Ticket(name,km,seat,type,bus1);
                ticket.setPrice(age);

                //satilan koltugu listeden kaldiralim
                ticket.getBus().getSeats().remove(seat);

                //bileti yazdiralim
                ticket.printTicket();



            }else {//uyari mesaji
                if (isreserved){
                    System.out.println("secilen koltuk reserve edilmistir mevcut degil veya reserve edilmistir");
                }else {
                    System.out.println("Hatali veri girdiniz yeniden deneyiniz");
                }
            }

        }
        while (select !=0);
        System.out.println("iyi günler dileriz, yine beklriz");

    }
}
