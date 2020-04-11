package basic._0324_class;

/**
 * @ClassName Student
 * @Description
 * @Author
 * @Date 2020/3/24 21:54
 * @Version 1.0
 **/
public class Student {

    public Student() {
        System.out.println("我是构造器");
    }

    /**
     * 成员变量（实例变量）
     */
    private String name = "Python大星";
    /**
     * 成员变量（类变量/静态变量）
     */
    private static String address = "China";

    /**
     * 普通方法
     */
    public void sayHello() {
        /**
         * 局部变量
         */
        int age = 18;
        System.out.println("我是普通方法，局部变量 age = " + 18);
    }

    /**
     * 静态方法
     */
    public static void show(){
        System.out.println("我是静态方法");
    }

    // 构造代码块
    {
        System.out.println("我是普通代码块");
    }
    // 静态代码块
    static {
        System.out.println("我是静态代码块");
    }

    public static void main(String[] args) {

    }

}
