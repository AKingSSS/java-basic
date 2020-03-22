package _0322_break_continue_return;

/**
 * @ClassName BreakDemo
 * @Description
 * @Author Python大星
 * @Date 2020/3/22 17:22
 * @Version 1.0
 **/
public class BreakDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) {
                break;
            }
            System.out.println("i = " + i);
        }
    }
}
