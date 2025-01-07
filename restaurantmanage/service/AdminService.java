package restaurantmanage.service;

import restaurantmanage.entities.Foot;
import restaurantmanage.entities.Staff;
import restaurantmanage.entities.User;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class AdminService implements IFootService<Foot>,IStaffService<User> {
    FootService footService = new FootService();
    StaffService staffService = new StaffService();

    /*private static AdminService instance;

    private AdminService() {

    }

    public static synchronized AdminService getInstance() {
        if (instance == null) {
            instance = new AdminService();
        }
        return instance;
    }*/

    @Override
    public void deleteFoot(Scanner scanner, ArrayList<Foot> objs) {
        System.out.println("nhập id món ăn muốn xóa");
        int id = Integer.parseInt(scanner.nextLine());
        for (Foot foot : objs) {
            if (id == Foot.getAutoId()){
                objs.remove(foot);
                System.out.println("đã xóa món ăn");
            } else {
                System.out.println("id món ăn không tồn tại");
            }
        }
    }

    @Override
    public void addnewFoot(Scanner scanner, ArrayList<Foot> objs) {
        System.out.println("nhập thông tin món ăn mới");
        footService.createFoot(scanner, objs);
    }

    @Override
    public void fixFoot(Scanner scanner, ArrayList<Foot> objs) {
        System.out.println("nhập id món ăn muốn thay đổi giá");
        int id = Integer.parseInt(scanner.nextLine());
        for (Foot foot : objs) {
            if (id == Foot.getAutoId()){
                System.out.println("nhập giá mới cho món ăn");
                BigDecimal price = new BigDecimal(scanner.nextLine());
                foot.setFootPrice(price);
                System.out.println("cập nhật giá thành công");
            }
        }
    }

    @Override
    public void deleteStaff(Scanner scanner, ArrayList<User> objs) {
        System.out.println("nhập id nhân viên muốn xóa");
        int idStaff = Integer.parseInt(scanner.nextLine());
        for (User user : objs) {
            if (idStaff == Staff.getAutoId()){
                objs.remove(user);
                System.out.println("đã xóa nhân viên khỏi hệ thống");
            } else {
                System.out.println("id không tồn tại trong hệ thống");
            }
        }
    }

    @Override
    public void addnewStaff(Scanner scanner, ArrayList<User> objs) {
        System.out.println("nhập thông tin nhân viên mới");
        staffService.creatStaff(scanner,objs);
    }
}
