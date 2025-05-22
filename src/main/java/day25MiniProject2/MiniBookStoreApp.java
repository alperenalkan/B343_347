package day25MiniProject2;

import java.util.Scanner;

public class MiniBookStoreApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        startApplication();
    }

    private static void startApplication() {
        Scanner scanner = new Scanner(System.in);
        //1-book, notebook class ini olusturalim

        //10-kategori secimi icin menü

        int select;
        System.out.println("--- Mini Book Store ---");
        do {
            System.out.println("Ürün Yönetim Pnaeli");
            System.out.println("1-Kitaplar");
            System.out.println("2-Defterler");
            System.out.println("0-ÇIKIŞ");
            System.out.println("Seçiminiz : ");
            select = scanner.nextInt();
            //1 veya 2 secilirse servis(ProductService) objesi gerekli

            ProductService service;
            BookService bookService = new BookService();
            NotebookService notebookService = new NotebookService();

            if (select==1 || select==2){
                service= select==1 ? bookService : notebookService;
                service.processMenu(); //uygulamamiz gelisime acik,degisime kapali
            } else if (select==0) {
                System.out.println("iyi günler..");
            }else {
                System.out.println("hatali giris !!!");
            }


        }while (select!=0);
    }
}
