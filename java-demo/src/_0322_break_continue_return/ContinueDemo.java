package _0322_break_continue_return;

/**
 * @ClassName ContinueDemo
 * @Description
 * @Author Python 大星
 * @Date 2020/3/22 17:36
 * @Version 1.0
 **/
public class ContinueDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println("i = " + i);
        }
    }
}
