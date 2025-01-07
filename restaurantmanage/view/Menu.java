package restaurantmanage.view;

import restaurantmanage.entities.Customer;
import restaurantmanage.entities.Foot;
import restaurantmanage.entities.Order;
import restaurantmanage.entities.User;
import restaurantmanage.service.AdminService;
import restaurantmanage.service.CustomerService;
import restaurantmanage.service.StaffService;
import restaurantmanage.service.UserService;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    UserService userService = UserService.getInstance();
    AdminService adminService = AdminService.getInstance();
    StaffService staffService = StaffService.getInstance();
    CustomerService customerService = CustomerService.getInstance();


    public void displayMenu(Scanner scanner,ArrayList<User>users,ArrayList<Foot> foots,ArrayList<Customer> customers, ArrayList<Order> orders) {
        System.out.println("1- đăng nhập\n" +
                "2- đăng ký");
        selectMenu(scanner,users,foots,customers,orders);
    }

    public void selectMenu(Scanner scanner, ArrayList<User>users, ArrayList<Foot> foots,ArrayList<Customer> customers, ArrayList<Order> orders) {
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                userService.login(scanner,users);
                for (User user : users) {
                    if (user.getRole()==0){
                        displayMenuAdmin(scanner,users,foots);
                    } else if (user.getRole()==1){
                        displayMenuStaff(scanner,customers,orders);
                    } else {
                        displayMenuCustomer(scanner,foots,customers,orders);
                    }
                }
                break;
            case 2:
                userService.register(scanner,users);
                break;
        }
    }

    public void displayMenuAdmin(Scanner scanner,ArrayList<User>users, ArrayList<Foot> foots) {
        System.out.println("1-Thêm nhân viên\n" +
                "2-Xóa nhân viên\n" +
                "3-Thêm món ăn\n" +
                "4-Xóa món ăn\n" +
                "5-Sửa món ăn");
        selectMenuAdmin(scanner,users,foots);
    }

    public void selectMenuAdmin(Scanner scanner, ArrayList<User>users, ArrayList<Foot> foots) {
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                adminService.addnewStaff(scanner,users);
                break;
            case 2:
                adminService.deleteStaff(scanner,users);
                break;
            case 3:
                adminService.addnewFoot(scanner,foots);
                break;
            case 4:
                adminService.deleteFoot(scanner,foots);
                break;
            case 5:
                adminService.fixFoot(scanner,foots);
                break;
        }
    }

    public void displayMenuStaff(Scanner scanner,ArrayList<Customer> customers, ArrayList<Order> orders) {
        System.out.println("1- Nhận danh sách món ăn yêu cầu từ khách\n" +
                "2- Cập nhật trạng thái món ăn");
        selectMenuStaff(scanner,customers,orders);
    }

    public void selectMenuStaff(Scanner scanner, ArrayList<Customer> customers, ArrayList<Order> orders) {
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                staffService.seeOrder(scanner,customers,orders);
                break;
            case 2:
                staffService.updateStatus(scanner,orders);
                break;
        }
    }

    public void displayMenuCustomer(Scanner scanner,ArrayList<Foot>foots,ArrayList<Customer> customers, ArrayList<Order> orders) {
        System.out.println("1-Xem danh sách món ăn\n" +
                "2-Đặt món ăn\n" +
                "3-Xem danh sách món ăn đã order");
        selectMenuCustomer(scanner,foots,customers,orders);
    }

    public void selectMenuCustomer(Scanner scanner, ArrayList<Foot>foots,ArrayList<Customer>customers, ArrayList<Order>orders) {
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                customerService.seeListFoot(scanner,foots);
                break;
            case 2:
                customerService.putFoot(scanner,foots,orders,customers);
                break;
            case 3:
                customerService.seeListFoot(scanner,foots);
                break;
        }
    }




}
