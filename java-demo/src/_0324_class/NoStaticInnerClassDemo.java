package _0324_class;

/**
 * @ClassName NoStaticInnerClassDemo
 * @Description 成员内部类
 * @Author
 * @Date 2020/3/24 23:49
 * @Version 1.0
 **/
public class NoStaticInnerClassDemo {
    public String name = "Python大星";
    private static int age = 20;

    class Inner {
        private String name;

        public void fun() {
            System.out.println("我是非静态内部类/成员内部类");
        }
    }

    public static void main(String[] args) {
        NoStaticInnerClassDemo noStaticInnerClassDemo = new NoStaticInnerClassDemo();
        Inner in = noStaticInnerClassDemo.new Inner();
        in.fun();
    }
}
