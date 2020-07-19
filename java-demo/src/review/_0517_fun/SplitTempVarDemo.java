package review._0517_fun;

/**
 * @ClassName SplitTempVarDemo
 * @Description TODO
 * @Author aking
 * @Date 2020/5/17 22:13
 * @Version 1.0
 **/
public class SplitTempVarDemo {
    /**
     * 重构前
     *
     * @param height
     * @param width
     */
    public void getArea(int height, int width) {
        int temp = 2 * (height + width);
        System.out.println(temp);
        temp = height * width;
        System.out.println(temp);
    }

    /**
     * 重构后
     *
     * @param height
     * @param width
     */
    public void getArea2(int height, int width) {
        final int temp = 2 * (height + width);
        System.out.println(temp);
        final int area = height * width;
        System.out.println(temp);
    }
}
