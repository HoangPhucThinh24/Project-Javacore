package restaurantmanage.service;



import restaurantmanage.entities.User;

import java.util.ArrayList;
import java.util.Scanner;

public class UserService {

    /*private static UserService instance;

    private UserService() {

    }

    public static synchronized UserService getInstance() {
        if (instance == null) {
            instance = new UserService();
        }
        return instance;
    }*/

    public void register (Scanner scanner, ArrayList<User> users){
        System.out.println("Mời bạn nhập username: ");
        String username = scanner.nextLine();
        findByUsername(username,users);
        System.out.println("Mời bạn nhập password: ");
        String password = scanner.nextLine();
        User user = new User(username,password);
        user.setRole(2);
        users.add(user);
        System.out.println("đăng ký tài khoản thành công");
    }

    public User login(Scanner scanner, ArrayList<User> users){
        System.out.println("Mời bạn nhập username: ");
        String username = scanner.nextLine();
        System.out.println("Mời bạn nhập password: ");
        String password = scanner.nextLine();
        User user = findByUsernameAndPassword(username, password, users);
        if(user !=null){
            System.out.println("Đăng nhập thành công");
        } else {
            System.out.println("tài khoản or mật khẩu không chính xác");
        }
        return user;
    }

    public User findByUsernameAndPassword(String username, String password, ArrayList<User> users){
        for (User user: users){
            if(user.getUsername().equals(username) && user.getPassword().equals(password)){
                return user;
            }
        }
        return null;
    }

    public void findByUsername(String username, ArrayList<User> users){
        for (User user: users){
            if(username.equals(user.getUsername())){
                System.out.println("Username đã tổn tại");
                System.exit(0);
            }
        }
    }



}
