package restaurantmanage.service;

import restaurantmanage.entities.Foot;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class FootService {
    private static FootService instance;

    private FootService() {

    }

    public static FootService getInstance() {
        if (instance == null) {
            instance = new FootService();
        }
        return instance;
    }

    public void createFoot(Scanner scanner , ArrayList<Foot> foots){
        System.out.println("nhập tên món ăn");
        String footname = scanner.nextLine();
        findByFootName(footname,foots);
        System.out.println("nhập giá món ăn");
        BigDecimal footprice = new BigDecimal(scanner.nextLine());
        Foot foot = new Foot(footname,footprice);
        foots.add(foot);
    }

    public void findByFootName(String footname, ArrayList<Foot> foots){
        for (Foot foot : foots) {
            if (foot.getFootName().equals(footname)) {
                System.out.println("món ăn đã tồn tại");
                System.exit(0);
            }
        }
    }

    public Foot findByIdFoot(int idFoot, ArrayList<Foot> foots){
        for (Foot foot : foots) {
            if (foot.getFootId()==idFoot){
                return foot;
            }
        } return null;
    }
}
