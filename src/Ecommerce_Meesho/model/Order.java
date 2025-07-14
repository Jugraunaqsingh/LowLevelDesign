package Ecommerce_Meesho.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class Order {
    private String               buyerid;
    private String               orderid;
    private List<OrderItem>      items;
    private LocalDateTime        orderDate;
    private BigDecimal           total;
    private PaymentMode          paymentMode;

    // getters
    public List<OrderItem> getItems() {
        return items;
    }

    public String getBuyerid() {
        return buyerid;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public String getOrderid() {
        return orderid;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    // setters
    public void setBuyerid(String buyerid) {
        this.buyerid = buyerid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }
}