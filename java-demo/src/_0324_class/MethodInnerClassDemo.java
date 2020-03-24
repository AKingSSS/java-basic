package _0324_class;

/**
 * @ClassName MethodInnerClassDemo
 * @Description 方法内部类
 * @Author
 * @Date 2020/3/24 23:57
 * @Version 1.0
 **/
public class MethodInnerClassDemo {
    public String name = "Python大星";
    private static int age = 20;

    public void  say() {
        //方法内部类即嵌套在方法里面
        class Inner{
            private String name;

            public void fun() {
                System.out.println("我是局部内部类");
            }
        }
        Inner inner = new Inner();
        inner.fun();
    }

    public static void main(String[] args) {
        MethodInnerClassDemo methodInnerClassDemo = new MethodInnerClassDemo();
        methodInnerClassDemo.say();
    }
}
