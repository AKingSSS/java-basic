package review._0517_fun;

/**
 * @ClassName RemoveParam
 * @Description TODO
 * @Author aking
 * @Date 2020/5/17 22:28
 * @Version 1.0
 **/
public class RemoveParam {
    public int Discount(int inputVal, int quantity, int yeaarToDate) {
        if (inputVal > 50) inputVal -= 2;
        if (quantity > 100) inputVal -= 1;
        if (yeaarToDate > 10000) inputVal -= 4;
        return inputVal;
    }
}
