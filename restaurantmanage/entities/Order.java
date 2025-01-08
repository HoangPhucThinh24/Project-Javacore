package restaurantmanage.entities;

import java.time.LocalDate;

public class Order {
    private static int autoId;
    private int id;
    private int footId;
    private int customerId;
    private int quantity;
    private LocalDate purchaseDate;
    private String status;

    public Order(int quantity, int customerId, int footId) {
        this.purchaseDate = LocalDate.now();
        this.quantity = quantity;
        this.customerId = customerId;
        this.footId = footId;
        this.id = ++autoId;
        this.status = "chờ xác nhận";
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static int getAutoId() {
        return autoId;
    }

    public static void setAutoId(int autoId) {
        Order.autoId = autoId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFootId() {
        return footId;
    }

    public void setFootId(int footId) {
        this.footId = footId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", footId=" + footId +
                ", customerId=" + customerId +
                ", quantity=" + quantity +
                ", borrowDate=" + purchaseDate +
                ", status='" + status + '\'' +
                '}';
    }
}
