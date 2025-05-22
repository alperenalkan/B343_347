package day25MiniProject2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//2-a: bookla ilgili methodlarimiz icin productservice i implemente edelim.
public class BookService implements ProductService {

    Scanner scanner = new Scanner(System.in);

    //3-kitaplari saklamak icin bir list olusturabiliriz.
    List<Book> bookList = new ArrayList<>();

    //4-uygulamayi baslatirken kayitli kitap olsun istiyoruz.
    public BookService() {
        Book book1=new Book("Vadideki Zambak",150.0,25,"Balzac","Penguin");
        Book book2=new Book("Suç ve Ceza",150.0,12,"Dostoyevski","Penguin");
        Book book3=new Book("Sefiller",125.0,15,"V.Hugo","Dream");
        this.bookList.add(book1);
        this.bookList.add(book2);
        this.bookList.add(book3);
    }

    //5-kitapla ilgili yapabilecegi islemleri gösteren bir menü
    @Override
    public void processMenu() {

        int select;
        do {
            System.out.println("----------------------------------------------");
            System.out.println("1-Kitapları Listele");
            System.out.println("2-Kitap Ekle");
            System.out.println("3-Kitap Sil");
            System.out.println("4-Yayınevine göre filtrele");
            System.out.println("0-Geri Dön");
            System.out.println("Seçiminiz: ");

            select = scanner.nextInt();
            scanner.nextLine();

            switch (select){
                case 1:
                    listProduct();
                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    removeProduct();
                    break;
                case 4:
                    System.out.println("yayinevini giriniz");
                    String filter =scanner.nextLine();
                    filterProduct(filter);
                    break;
                case 0:
                    System.out.println("Ana menüye yönlendiriliyorsunuz");
                    break;
                default:
                    System.out.println("hatali giris!!!");
                    break;
            }

        }while (select !=0);

    }

    //6-kitaplari listeleme
    @Override
    public void listProduct() {
        System.out.println("-----------------------------------------------------------------------");
        System.out.printf("%-2s | %-20s | %-10s | %-10s | %-5s | %-5s \n",
                "ID","Kitabın Adı","Yazar","Yayınevi","Fiyat","Stok");
        for (Book book: this.bookList){
            System.out.printf("%-2s | %-20s | %-10s | %-10s | %-5s | %-5s \n",
                  book.getId(),book.getName(),book.getAuthor(),book.getPublisher(),book.getPrice(),book.getStock());
        }
        System.out.println("-----------------------------------------------------------------------");

    }

    @Override
    public void addProduct() {
        System.out.println("Kitap adı : ");
        String bookname = scanner.nextLine();

        System.out.println("Yazar adı : ");
        String author = scanner.nextLine();

        System.out.println("Yayınevi : ");
        String publisher = scanner.nextLine();

        System.out.println("Stok : ");
        int stock = scanner.nextInt();

        System.out.println("Fiyat : ");
        double price = scanner.nextDouble();

        Book newBook = new Book(bookname,price,stock,author,publisher);
        this.bookList.add(newBook);

    }
    //8-id ile kitabi bbluup silme
    @Override
    public void removeProduct() {
        boolean isExist = false;
        System.out.println("Kitap id : ");
        int id = scanner.nextInt();

        //id si verilen kitap var mi
        for (Book book:this.bookList){
            if (book.getId()==id){ //kitabi bulduk
                isExist=true;
                this.bookList.remove(book);
                System.out.println("kitap basariyla silindi");
                break;
            }
        }

        if (!isExist){
            System.out.println("Kitap Bulunamadi !!!");
        }

    }

    //9-listedeki kitapkardan verilen yayinevi ile eslesneleri bulup listeleme
    @Override
    public void filterProduct(String filter) {
        System.out.println("-----------------------------------------------------------------------");
        System.out.printf("%-2s | %-20s | %-10s | %-10s | %-5s | %-5s \n",
                "ID","Kitabın Adı","Yazar","Yayınevi","Fiyat","Stok");

        for (Book book: this.bookList){
            if (book.getPublisher().equalsIgnoreCase(filter)){
                System.out.printf("%-2s | %-20s | %-10s | %-10s | %-5s | %-5s \n",
                        book.getId(),book.getName(),book.getAuthor(),book.getPublisher(),book.getPrice(),book.getStock());
            }
        }
        System.out.println("-----------------------------------------------------------------------");


    }
}
