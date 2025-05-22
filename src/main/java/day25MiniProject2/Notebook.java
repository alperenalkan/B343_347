package day25MiniProject2;
//1-c:defterin özelliklerini tutmak için notebook classı oluşturalım: product+sheets,brand
public class Notebook extends Product{

    private int sheets;
    private String brand;

    //parametreli constructor
    public Notebook(double price, String name, int stock, int sheets, String brand) {
        super(price, name, stock);
        this.sheets = sheets;
        this.brand = brand;
    }

    public int getSheets() {
        return sheets;
    }

    public void setSheets(int sheets) {
        this.sheets = sheets;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
//uygulamada verileri tutmak için oluşturduğumuz classlar:
//1-private fieldlar
//2-paramli/paramsiz const
//3-getter-setter
//4-toString