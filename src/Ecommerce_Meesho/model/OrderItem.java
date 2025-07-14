package Ecommerce_Meesho.model;

import java.math.BigDecimal;

public class OrderItem {
    private String productId;
    private BigDecimal unitprice;
    private int quantity;
    //getters
    public String getProductId(){
        return this.productId;
    }
    public int getQuantity(){
        return this.quantity;
    }
    public BigDecimal getUnitprice(){
        return this.unitprice;
    }
    //setters
    public void setProductId(String pid){
        this.productId=pid;
    }
    public void setUnitprice(BigDecimal p){
        this.unitprice=p;
    }
    public void setQuantity(int q){
        this.quantity=q;
    }

}
