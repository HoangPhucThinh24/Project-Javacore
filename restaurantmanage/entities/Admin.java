package restaurantmanage.entities;

public class Admin extends User {
    private static int autoId;
    private int adminId;


    public Admin(String username, String password, String name, int adminId) {
        super(username, password, name);
        this.adminId = adminId;
    }

    public static int getAutoId() {
        return autoId;
    }

    public static void setAutoId(int autoId) {
        Admin.autoId = autoId;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

}
