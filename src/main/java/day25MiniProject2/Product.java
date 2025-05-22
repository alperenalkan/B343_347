package day25MiniProject2;

public class Product {
    private static int  counter =0;
    private int id;
    private String name;
    private double price;
    private int stock;

    //paramli const:obje oluşurken baştan fieldlarını set edebiliriz
    //ya da daha sonra setter metodları ile tek tek set edilebilir
    //setName(),setPrice(),setStock() metodalrı tek tek kullanılır
    public Product(double price, String name, int stock) {
        counter ++; //her yeni bir üründe id articak.
        this.id = counter;
        this.price = price;
        this.name = name;
        this.stock = stock;
    }

    //getter-setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
