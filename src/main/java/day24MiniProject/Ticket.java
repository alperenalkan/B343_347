package day24MiniProject;

public class Ticket {
    //4-yolcu adi, mesafe(KM), koltuk no, yolculuk tipi(1-2), otobüs

    private String name;
    private double distance;
    private String seatNo;
    private int typeNo;
    private double price;

    //otobüs ile bilet arasinda bir ilski var
    private Bus bus; //bu bilet hangi otobüse ait anlamak icin

    //parametreli constructor


    public Ticket(String name, double distance, String seatNo, int typeNo, Bus bus) {
        this.name = name;
        this.distance = distance;
        this.seatNo = seatNo;
        this.typeNo = typeNo;
        this.bus = bus;
    }

    //getter-setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }

    public int getTypeNo() {
        return typeNo;
    }

    public void setTypeNo(int typeNo) {
        this.typeNo = typeNo;
    }

    public double getPrice() {
        return price;
    }

    //5-bilet fiyati belirlenen kurallara gööre hesaplanp set edilmeli
    public void setPrice(int age) {
        double total = 0;
        int seatNo= Integer.valueOf(this.seatNo);

        switch (this.typeNo){ // 1:tek yön , 2:cift yön
            case  1:
                if (seatNo%3==0){
                    total = this.distance*1.2;
                }else {
                    total = this.distance*1;
                }
                System.out.println("toplam tutar: "+total);
                break;
            case  2:
                if (seatNo%3==0){
                    total = this.distance*1.2*2;
                }else {
                    total = this.distance*2;
                }
                System.out.println("toplam tutar "+total);

                // cift yön indirimi %20 indirim
                total = total*0.8;

                System.out.println("toplam tutar indirimli: "+total);
                break;


        }
        //yas indirimi
        if(age<12){
            total = total*0.5;
            System.out.println("12 yas inidrimli tutar"+ total);
        } else if (age>65) {
            total=total*0.7;
            System.out.println("65 yaş indirimli tutar : "+total);
        }

        this.price =total; //price i total ile set ediyoruz.

    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }


    //6-bilet dökümünü yazdıralım
    public void printTicket(){
        System.out.println("*".repeat(42));
        System.out.println(" --- Bilet Detayı ---");
        System.out.println("Sayın "+this.name);
        System.out.println("Otobüs plakası : "+this.bus.getNumberPlate());
        System.out.println("Mesafe(KM      : "+this.distance);
        System.out.println("Koltuk no      : "+this.seatNo);
        System.out.println("Yolculuk Tipi  : "+(this.typeNo==1 ? "Tek Yön" : "Gidiş-Dönüş"));
        System.out.println("Toplam tutar   : "+this.price);
        System.out.println("Keyifli yolculuklar dileriz...");
        System.out.println("*".repeat(42));
    }
}
