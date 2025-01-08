package restaurantmanage.entities;

public class Customer extends User {
    private static int autoId;
    private int customerId;

    public Customer(String username, String password, String name, int customerId) {
        super(username, password, name);
        this.customerId = customerId;
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
