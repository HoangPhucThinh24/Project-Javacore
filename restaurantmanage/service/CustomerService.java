package restaurantmanage.service;


import restaurantmanage.entities.Customer;
import restaurantmanage.entities.Foot;
import restaurantmanage.entities.Order;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerService {
    FootService footService = FootService.getInstance();
    OrderService orderService = OrderService.getInstance();

    public static CustomerService instance;

    public CustomerService() {

    }

    public static CustomerService getInstance() {
        if (instance == null) {
            instance = new CustomerService();
        }
        return instance;
    }

    public void seeListFoot(Scanner scanner, ArrayList<Foot>foots){
        System.out.println("danh sách món ăn");
        System.out.println(foots);
    }

    public void putFoot(Scanner scanner, ArrayList<Foot>foots, ArrayList<Order> orders, ArrayList<Customer> customers) {
        System.out.println("nhập thông tin để đặt món ăn");
        orderService.inputInfoOrder(scanner,customers,foots,orders);
    }

    public void checkStatus(Scanner scanner,ArrayList<Order>orders) {
        System.out.println("danh sách món ăn đã đặt");
        System.out.println(orders);
    }

    public Customer findByIdCustomer(ArrayList<Customer>customers,int idCustomer) {
        for (Customer customer : customers) {
            if (customer.getCustomerId()==idCustomer) {
                return customer;
            }
        } return null;
    }

}
