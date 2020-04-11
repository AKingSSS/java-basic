package basic._0321_exception;

/**
 * @ClassName ThrowsDemo
 * @Description
 * @Author yangkang
 * @Date 2020/3/21 23:38
 * @Version 1.0
 **/
public class ThrowsDemo {
    public static void main(String[] args) {
        try {
            test();
        } catch (MyException e) {
            System.out.println("Catch My Exception");
            e.printStackTrace();
        }
    }

    public static void test() throws MyException {
        try {
            int i = 10 / 0;
            System.out.println("i=" + i);
        } catch (ArithmeticException e) {
            throw new MyException("This is MyException");
        }
    }
}
