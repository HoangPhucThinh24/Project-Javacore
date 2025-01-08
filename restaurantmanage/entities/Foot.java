package restaurantmanage.entities;

import java.math.BigDecimal;

public class Foot {
    private static int autoId;
    private int footId;
    private String footName;
    private BigDecimal footPrice;

    public Foot(String footName, BigDecimal footPrice) {
        this.footId = ++autoId;
        this.footName = footName;
        this.footPrice = footPrice;
    }

    public static int getAutoId() {
        return autoId;
    }

    public static void setAutoId(int autoId) {
        Foot.autoId = autoId;
    }

    public int getFootId() {
        return footId;
    }

    public void setFootId(int footId) {
        this.footId = footId;
    }

    public String getFootName() {
        return footName;
    }

    public void setFootName(String footName) {
        this.footName = footName;
    }

    public BigDecimal getFootPrice() {
        return footPrice;
    }

    public void setFootPrice(BigDecimal footPrice) {
        this.footPrice = footPrice;
    }

    @Override
    public String toString() {
        return "Foot{" +
                "footId=" + footId +
                ", footName='" + footName + '\'' +
                ", footPrice=" + footPrice +
                '}';
    }
}
