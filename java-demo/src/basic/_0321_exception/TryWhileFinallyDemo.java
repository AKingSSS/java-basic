package basic._0321_exception;

/**
 * @ClassName TryWhileFinallyDemo
 * @Description 测试try 里死循环，finally
 * @Author yk
 * @Date 2020/5/1 21:25
 * @Version 1.0
 **/
public class TryWhileFinallyDemo {
    public static void main(String[] args) {
        int i = 0;
        try {
            while (true) {
                i ++;
            }
        } finally {
            System.out.println("i = " + i);
        }
    }
}
