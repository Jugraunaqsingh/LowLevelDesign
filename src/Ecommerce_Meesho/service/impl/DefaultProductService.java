package Ecommerce_Meesho.service.impl;
import Ecommerce_Meesho.model.Product;
import Ecommerce_Meesho.repository.ProductRepository;
import Ecommerce_Meesho.service.ProductService;
import java.util.*;
public class DefaultProductService implements ProductService{
    private final ProductRepository repo;
    public DefaultProductService(ProductRepository repo){
        this.repo=repo;
    }
    public void addProduct(Product p){
        repo.save(p);
    }
    public void updateProduct(Product p){
        repo.update(p);
    }
    public Product getProductById(String productId){
        return repo.findById(productId).orElseThrow(() -> new RuntimeException("Product not found: " + productId));
    }
    @Override
    public List<Product> getAllProducts() {
        return repo.findAll();
    }
}
