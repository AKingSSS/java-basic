package _0322_break_continue_return;

/**
 * @ClassName TryRetrunDemo
 * @Description
 * @Author yangkang
 * @Date 2020/3/22 18:00
 * @Version 1.0
 **/
public class TryRetrunDemo {
    public static void main(String[] args) {
        System.out.println("testReturn1() = " + testReturn1());
    }

    public static int testReturn1() {
        int i = 1;
        try {
            i++;
//            int j = i/0; // 发生异常执行最有一个return
            System.out.println("try:" + i);
            return i;
        } catch (Exception e) {
            i++;
            System.out.println("catch:" + i);
        } finally {
            i++;
            System.out.println("finally:" + i);
        }
        return i;
    }
}
