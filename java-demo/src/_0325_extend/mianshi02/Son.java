package _0325_extend.mianshi02;

/**
 * @ClassName Son
 * @Description
 * @Author yangkang
 * @Date 2020/3/26 22:41
 * @Version 1.0
 **/
public class Son extends Parent {
    static {
        System.out.println("静态代码块Son");
    }

    {
        System.out.println("构造代码块Son");
    }

    public Son() {
        System.out.println("构造方法Son");
    }
}
