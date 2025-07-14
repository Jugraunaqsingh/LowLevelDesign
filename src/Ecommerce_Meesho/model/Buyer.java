package Ecommerce_Meesho.model;

public class Buyer {
    private String buyerId;
    private String name;
    private String email;
    private String phone;
    private String address;
    //getters
    public String getBuyerId(){
        return this.buyerId;
    }
    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public String getPhone(){
        return this.phone;
    }
    public String getAddress(){
        return this.address;
    }

    //setters

    public void setBuyerId(String id){
        this.buyerId=id;
    }
    public void setName(String n){
        this.name=n;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setPhone(String phone){
        this.phone=phone;
    }
    public void setAddress(String add){
        this.address=add;
    }

}
