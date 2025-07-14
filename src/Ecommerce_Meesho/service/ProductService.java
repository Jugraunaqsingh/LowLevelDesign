package Ecommerce_Meesho.service;
import Ecommerce_Meesho.model.Product;
import java.util.List;
public interface ProductService {
    void addProduct(Product product);
    void updateProduct(Product product);
    Product getProductById(String productId);
    List<Product> getAllProducts();
}
