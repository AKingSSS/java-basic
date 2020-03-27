package _0325_extend.mianshi02;

/**
 * @ClassName Parent
 * @Description
 * @Author yangkang
 * @Date 2020/3/26 22:27
 * @Version 1.0
 **/
public class Parent {
    static {
        System.out.println("静态代码块Parent");
    }

    {
        System.out.println("构造代码块Parent");
    }

    public Parent() {
        System.out.println("构造方法Parent");
    }
}
