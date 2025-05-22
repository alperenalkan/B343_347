package day25MiniProject2;

//1-b:kitabın özelliklerini tutmak için book classı oluşturalım: product+publisher,author
public class Book extends Product{

    //id,name,stock,price
    private String author;
    private String publisher;

    //paramtreli constructor
    public Book(String name,double price,  int stock, String author, String publisher) {
        super(price, name, stock);
        this.author = author;
        this.publisher = publisher;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
