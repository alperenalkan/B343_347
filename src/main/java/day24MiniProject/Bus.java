package day24MiniProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bus {//POJO Plain Old Java Object

    //2-plaka, koltuk sayısı, firma adı, koltuk numaraları

    private String numberPlate;
    private int seatnumber;
    private String companyName;
    private List<String> seats =new ArrayList<>(seatnumber);

    //3-otobüs objesi olustururken fieldlari baslangicta set edilmis olsun.


    public Bus(String numberPlate, int seatnumber, String companyName) {
        this.numberPlate = numberPlate; //34 TPE 789
        this.seatnumber = seatnumber; //35
        this.companyName = companyName; //TPEBUS

        for (int i = 1; i <this.seatnumber+1 ; i++) {

            seats.add(Integer.toString(i)); //seats.add(i+""); 2.yol
        }

    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public int getSeatnumber() {
        return seatnumber;
    }

    public void setSeatnumber(int seatnumber) {
        this.seatnumber = seatnumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public List<String> getSeats() {
        return seats;
    }

//koltuk numaralari constructor ile set edildikten sonra degismemeli
//    public void setSeats(List<String> seats) {
//        this.seats = seats;
//    }

}
