package restaurantmanage.entities;

public class Staff extends User {
    private int staffId;
    private static int autoId;

    public Staff(String username, String password, String name, int staffId) {
        super(username, password, name);
        this.staffId = staffId;
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public static int getAutoId() {
        return autoId;
    }

    public static void setAutoId(int autoId) {
        Staff.autoId = autoId;
    }

}
