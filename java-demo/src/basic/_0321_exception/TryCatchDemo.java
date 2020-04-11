package basic._0321_exception;

/**
 * @ClassName TryCatchDemo
 * @Description
 * @Author yangkang
 * @Date 2020/3/21 23:20
 * @Version 1.0
 **/
public class TryCatchDemo {
    public static void main(String[] args) {
        try {
            int i = 10/0;
            System.out.println("i="+i);
        } catch (Exception e) {
            System.out.println("Caught Exception");
            System.out.println("e.getMessage(): " + e.getMessage());
            System.out.println("e.toString(): " + e.toString());
            System.out.println("e.printStackTrace():");
            e.printStackTrace();
        }
    }
}
