package Ecommerce_Meesho.repository;
import java.util.*;
import java.util.Optional;

import Ecommerce_Meesho.model.Product;

public interface ProductRepository {
    void save(Product product);
    Optional<Product> findById(String pid);
    void update(Product product);
    List<Product> findAll();

}
