package _0322_break_continue_return;

/**
 * @ClassName ContinueDemo
 * @Description
 * @Author Python 大星
 * @Date 2020/3/22 17:36
 * @Version 1.0
 **/
public class ContinueDemo2 {
    public static void main(String[] args) {
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 4; j++) {
                if (j == 2) {
                    continue;
                }
                System.out.println(i + "*" + j + "=" + (i * j));
            }
        }
    }
}
