package Ecommerce_Meesho.model;

public class InventoryItem {
    private String productId;
    private int stocklevel;
    //getters
    public String getProductId(){
        return productId;
    }
    public int getStocklevel(){
        return stocklevel;
    }
    public void setProductId(String id){
        this.productId=id;

    }
    public void setStocklevel(int stocklevel){
        this.stocklevel=stocklevel;
    }


}
