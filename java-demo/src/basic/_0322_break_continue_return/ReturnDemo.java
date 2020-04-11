package basic._0322_break_continue_return;

/**
 * @ClassName ReturnDemo
 * @Description
 * @Author
 * @Date 2020/3/22 17:42
 * @Version 1.0
 **/
public class ReturnDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i > 3) {
                return;
            }
            System.out.println(i);
        }
    }
}
