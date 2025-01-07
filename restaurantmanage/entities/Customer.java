package restaurantmanage.entities;

public class Customer extends User {
    private static int autoId;
    private int customerId;

    public Customer(String username, String password) {
        super(username, password);
        this.customerId = ++autoId;
    }

    public static int getAutoId() {
        return autoId;
    }

    public static void setAutoId(int autoId) {
        Customer.autoId = autoId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
}
