package basic._0322_break_continue_return;

/**
 * @ClassName BreakDemo
 * @Description
 * @Author Python大星
 * @Date 2020/3/22 17:22
 * @Version 1.0
 **/
public class BreakDemo2 {
    public static void main(String[] args) {
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 4; j++) {
                System.out.println(i + "*" + j + "=" + (i * j));
                if (j == 2) {
                    break;
                }
            }
        }
    }
}
