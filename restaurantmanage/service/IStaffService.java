package restaurantmanage.service;

import restaurantmanage.entities.User;

import java.util.ArrayList;
import java.util.Scanner;

public interface IStaffService<T> {
    void deleteStaff(Scanner scanner, ArrayList<T> objs);
    void addnewStaff(Scanner scanner, ArrayList<T> objs);
}
