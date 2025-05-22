package day25MiniProject2;
//tüm ürünlerin davranislarini gösterir
public interface ProductService {
    void processMenu();
    void listProduct();
    void addProduct();
    void removeProduct();
    void filterProduct(String filter);

}
