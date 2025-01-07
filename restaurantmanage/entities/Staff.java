package restaurantmanage.entities;

public class Staff extends User {
    private int staffId;
    private static int autoId;
    private String staffName;

    public Staff(String username, String password,String staffName) {
        super(username, password);
        this.staffId = ++autoId;
        this.staffName = staffName;
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

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }
}
