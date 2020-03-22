package _0321_exception;

/**
 * @ClassName TryReturnDemo
 * @Description
 * @Author yangkang
 * @Date 2020/3/22 0:15
 * @Version 1.0
 **/
public class TryReturnDemo {
    public static void main(String[] args) {
        try {
            int i = 10/0;
            System.out.println("i="+i);
            System.out.println("执行return");
            return;
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
