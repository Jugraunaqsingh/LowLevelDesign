package Ecommerce_Meesho.model;
import java.util.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.math.BigDecimal;
//POJO PLAIN OLD JAVA OBJECT!!!
public class Product {

    private String productID;
    private String Name;
    private LocalDate ExpiryDate;
    private BigDecimal price;
    //getters
    public String getProductId(){
        return this.productID;
    }
    public String getName(){
        return Name;
    }
    public LocalDate getExpiryDate(){
        return ExpiryDate;
    }
    public BigDecimal getPrice(){
        return price;
    }
    //setters
    public void setProductId(String pid){
        this.productID=pid;
    }
    public void setName(String n){
        this.Name=n;
    }
    public void setExpiryDate(LocalDate d){
        this.ExpiryDate=d;
    }
    public void setPrice(BigDecimal price){
        this.price=price;
    }




}
