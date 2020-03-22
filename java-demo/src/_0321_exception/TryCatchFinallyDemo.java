package _0321_exception;

/**
 * @ClassName TryCatchFinallyDemo
 * @Description
 * @Author yangkang
 * @Date 2020/3/21 23:31
 * @Version 1.0
 **/
public class TryCatchFinallyDemo {
    public static void main(String[] args) {
        try {
            int i = 10/0;
            System.out.println("i="+i);
        } catch (ArithmeticException e) {
            System.out.println("Caught Exception");
            System.out.println("e.getMessage(): " + e.getMessage());
            System.out.println("e.toString(): " + e.toString());
            System.out.println("e.printStackTrace():");
            e.printStackTrace();
        } finally {
            System.out.println("run finally");
        }
    }
}
