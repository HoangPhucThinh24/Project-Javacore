package restaurantmanage.service;



import restaurantmanage.entities.Customer;
import restaurantmanage.entities.Foot;
import restaurantmanage.entities.Order;
import restaurantmanage.ultils.Ultils;

import java.util.ArrayList;
import java.util.Scanner;

public class OrderService {

    private static OrderService instance;

    private OrderService() {

    }

    public static synchronized OrderService getInstance() {
        /*if (instance == null) {
            instance = new OrderService();
        }*/
        return instance;
    }

    CustomerService customerService = CustomerService.getInstance();
    FootService footService = FootService.getInstance();

    public void inputInfoOrder (Scanner scanner, ArrayList<Customer> customers, ArrayList<Foot>foots, ArrayList<Order>orders) {
        System.out.println("nhập id khách hàng order");
        int idCustomer = Ultils.inputInterger(scanner);
        customerService.findByIdCustomer(customers,idCustomer);
        System.out.println("nhập id món ăn order");
        int idFoot = Ultils.inputInterger(scanner);
        footService.findByIdFoot(idFoot,foots);
        System.out.println("nhập số lượng muốn order");
        int quantity = Ultils.inputInterger(scanner);
        Order order = new Order(idCustomer, idFoot, quantity);
        orders.add(order);
    }

}
