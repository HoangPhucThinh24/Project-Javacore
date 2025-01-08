package restaurantmanage.service;

import java.util.ArrayList;
import java.util.Scanner;

public interface IFootService<T> {
    void deleteFoot(Scanner scanner, ArrayList<T> objs);
    void addnewFoot(Scanner scanner,ArrayList<T> objs);
    void fixFoot(Scanner scanner,ArrayList<T> objs);
}
