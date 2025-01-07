package restaurantmanage.service;

import restaurantmanage.entities.Customer;
import restaurantmanage.entities.Foot;
import restaurantmanage.entities.Order;

import java.util.ArrayList;
import java.util.Scanner;

public class OrderService {

    public static OrderService instance;

    public OrderService() {

    }

    public static OrderService getInstance() {
        if (instance == null) {
            instance = new OrderService();
        }
        return instance;
    }

    CustomerService customerService = CustomerService.getInstance();
    FootService footService = FootService.getInstance();

    public void inputInfoOrder (Scanner scanner,ArrayList<Customer>customers,ArrayList<Foot>foots,ArrayList<Order>orders) {
        System.out.println("nhập id khách hàng order");
        int idCustomer = Integer.parseInt(scanner.nextLine());
        customerService.findByIdCustomer(customers, idCustomer);
        System.out.println("nhập id món ăn order");
        int idFoot = Integer.parseInt(scanner.nextLine());
        footService.findByIdFoot(idFoot,foots);
        System.out.println("nhập số lượng muốn order");
        int quantity = Integer.parseInt(scanner.nextLine());
        Order order = new Order(idCustomer, idFoot, quantity);
        orders.add(order);
    }
}
