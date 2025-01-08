package restaurantmanage;


import restaurantmanage.entities.Customer;
import restaurantmanage.entities.Foot;
import restaurantmanage.entities.Order;
import restaurantmanage.entities.User;
import restaurantmanage.view.Menu;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Foot> foots = new ArrayList<>();
        ArrayList<User> users = new ArrayList<>();
        ArrayList<Order> orders = new ArrayList<>();
        ArrayList<Customer> customers = new ArrayList<>();

        User user = new User("thinh","123","Hoàng Phúc Thịnh");
        user.setRole(0);
        users.add(user);

        Menu menu = new Menu();
        menu.displayMenu(scanner,users,foots,customers,orders);
    }
}
