package restaurantmanage.ultils;

import org.w3c.dom.ls.LSOutput;

import java.math.BigDecimal;
import java.util.Scanner;

public class Ultils {
    public static int inputInterger(Scanner scanner){
        try {
            int n = Integer.parseInt(scanner.nextLine());
            return n;
        } catch (Exception e) {
            System.out.println("lỗi "+e);
            return 0;
        }
    }

    public static BigDecimal inputBigDecimal(Scanner scanner){
        try {
            BigDecimal n = new BigDecimal(scanner.nextLine());
            return n;
        } catch (Exception e) {
            System.out.println("lỗi "+e);
            return null;
        }
    }
}
