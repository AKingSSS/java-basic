package basic._0324_class;

/**
 * @ClassName StaticInnerClassDemo
 * @Description 静态内部类
 * @Author
 * @Date 2020/3/24 23:39
 * @Version 1.0
 **/
public class StaticInnerClassDemo {
    public String name = "Python大星";
    private static int age = 20;

    static class Inner {
        private String name;
        public void fun() {
            System.out.println("我是静态内部类");
        }
    }

    public static void main(String[] args) {
        StaticInnerClassDemo.Inner in = new StaticInnerClassDemo.Inner();
        in.fun();
    }
}
