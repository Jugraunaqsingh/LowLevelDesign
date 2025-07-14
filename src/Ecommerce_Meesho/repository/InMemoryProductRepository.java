package Ecommerce_Meesho.repository;
import Ecommerce_Meesho.model.Product;
import Ecommerce_Meesho.repository.ProductRepository;
import java.util.*;
public class InMemoryProductRepository implements ProductRepository{
    private final Map<String, Product> store=new HashMap<>();
    @Override
    public void save(Product product){
        store.put(product.getProductId(),product);

    }
    public Optional<Product> findById(String pid){
        return Optional.ofNullable(store.get(pid));
    }
    public void update(Product product){
        store.put(product.getProductId(), product);

    }
    public List<Product> findAll(){
        return new ArrayList<>(store.values());
    }

}

