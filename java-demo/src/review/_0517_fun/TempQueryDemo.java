package review._0517_fun;

/**
 * @ClassName TempQueryDemo
 * @Description TODO
 * @Author aking
 * @Date 2020/5/17 21:33
 * @Version 1.0
 **/
public class TempQueryDemo {
    /**
     * 重构前
     *
     * @param width
     * @param height
     * @return
     */
    public double GetPrice(int width, int height) {
        int area = width * height;
        double discount;
        if (area > 1000) {
            discount = 0.9;
        } else {
            discount = 1;
        }
        return area * discount;
    }

    /**
     * 重构后
     *
     * @param width
     * @param height
     * @return
     */
    public double GetPrice2(int width, int height) {

        return getArea(width, height) * getDiscount(width, height);
    }

    private int getArea(int width, int height) {
        return width * height;
    }

    private double getDiscount(int width, int height) {
        double discount;
        if (getArea(width, height) > 1000) {
            discount = 0.9;
        } else {
            discount = 1;
        }
        return discount;
    }
}
