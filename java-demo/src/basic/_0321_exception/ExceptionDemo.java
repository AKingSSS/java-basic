package basic._0321_exception;

/**
 * @ClassName ExceptionDemo
 * @Description
 * @Author yangkang
 * @Date 2020/3/22 0:00
 * @Version 1.0
 **/
public class ExceptionDemo {
    public static void main(String[] args) //throws Exception
    {
        try {
            int x = 4 / 0;
            System.out.println("x=" + x);
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
        } catch (Exception e)//父类 写在此处是为了捕捉其他没预料到的异常 只能写在子类异常的代码后面
        //不过一般情况下是不写的
        {
            System.out.println(e.toString());
        }
        System.out.println("Over");
    }
}
