package restaurantmanage.service;

import restaurantmanage.entities.*;
import restaurantmanage.ultils.Ultils;

import java.util.ArrayList;
import java.util.Scanner;

public class StaffService {

    UserService userService = UserService.getInstance();

    private static StaffService instance;

    private StaffService() {

    }
    public static synchronized StaffService getInstance() {
        if (instance == null) {
            instance = new StaffService();
        }
        return instance;
    }

    public void creatStaff(Scanner scanner, ArrayList<User> users) {
        System.out.println("nhập username nhân viên mới");
        String username = scanner.nextLine();
        userService.findByUsername(username,users);
        System.out.println("nhập mật khẩu");
        String password = scanner.nextLine();
        System.out.println("nhập tên nhân viên");
        String name = scanner.nextLine();
        User user = new User(username,password,name);
        user.setRole(1);
        users.add(user);
    }

    public void seeOrder(Scanner scanner, ArrayList<Customer> customers, ArrayList<Order> orders) {
        System.out.println("nhập id khách hàng đã yêu cầu");
        int idCustomer = Ultils.inputInterger(scanner);
        for (Customer customer : customers) {
            if(customer.getCustomerId()==idCustomer ){
                System.out.println(orders);
            } else {
                System.out.println("username không tồn tại");
                System.exit(0);
            }
        }
    }

    public void updateStatus(Scanner scanner, ArrayList<Order> orders) {
        System.out.println("nhập id đơn hàng cần cập nhật trạng thái");
        int idOrder = Ultils.inputInterger(scanner);
        for (Order order : orders){
            if(order.getId() == idOrder){
                System.out.println("cập nhập trạng thái đơn hàng: 1-Đang xử lý  2-Đang giao hàng  3-Đã giao hàng");
                int idTicketFoot = Ultils.inputInterger(scanner);
                switch (idTicketFoot){
                    case 1:
                        order.setStatus("đang xử lý");
                        break;
                    case 2:
                        order.setStatus("đang giao hàng");
                        break;
                    case 3:
                        order.setStatus("đã giao hàng");
                        break;
                }
            }
        }
    }

    public void seeListFoot(ArrayList<Foot> foots) {
        System.out.println("danh sách món ăn");
        System.out.println(foots);
    }









}
