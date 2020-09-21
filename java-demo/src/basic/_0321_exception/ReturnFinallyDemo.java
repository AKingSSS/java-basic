package basic._0321_exception;

/**
 *@ClassName ReturnFinallyDemo
 *@Description
 *@Author yk
 *@Date 2020/9/21 16:47
 *@Version 1.0
 **/
public class ReturnFinallyDemo {
    public static int show() {
        try {
            System.out.println("show");
            return 1;
        }finally{
            System.out.println("finally模块被执行");
        }
    }

    /**
     * 如果程序是从 try 代码块或者 catch 代码块中返回时，finally 中的代码总会执行。而且 finally 语句在 return 语句执行之后 return 返回之前执行的。可以使用编译器的 Debug 功能查看详细过程。
     * @return
     */
    public static int show1() {
        try {
            int a = 8/0;
            return 1;
        }catch (Exception e) {
            return 2;
        }finally{
            System.out.println("finally模块被执行");
        }
    }

    /**
     * 我们可以看到当 finally 有返回值时，会直接返回。不会再去返回 try 或者 catch 中的返回值。
     * @return
     */
    public static int show2() {
        try {
            int a = 8/0;
            return 1;
        }catch (Exception e) {
            return 2;
        }finally{
            System.out.println("finally模块被执行");
            return 0;
        }
    }

    /**
     * 返回 0
     * @return
     */
    public static int show3() {
        int result = 0;
        try {
            return result;
        }finally{
            System.out.println("finally模块被执行");
            result = 1;
        }
    }

    /**
     * 返回不为null
     * @return
     */
    public static Object show4() {
        Object obj = new Object();
        try {
            return obj;
        }finally{
            System.out.println("finally模块被执行");
            obj = null;
        }
    }
    public static void main(String[] args) {
        // show();
        System.out.println(show4());
    }
}
