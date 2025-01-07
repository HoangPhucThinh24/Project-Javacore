package restaurantmanage.service;


import restaurantmanage.entities.Customer;
import restaurantmanage.entities.Foot;
import restaurantmanage.entities.Order;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerService {
    OrderService orderService = new OrderService();
    /*OrderService orderService = OrderService.getInstance();

    private static CustomerService instance;

    private CustomerService() {

    }

    public static synchronized CustomerService getInstance() {
        if (instance == null) {
            instance = new CustomerService();
        }
        return instance;
    }*/

    public void seeListFoot(ArrayList<Foot>foots){
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

    public Customer findByIdCustomer (ArrayList<Customer>customers,int idCustomer) {
        for (Customer customer : customers) {
            if (customer.getCustomerId()==idCustomer) {
                return customer;
            }
        }
        return null;
    }

}
