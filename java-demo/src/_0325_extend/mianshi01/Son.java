package _0325_extend.mianshi01;

/**
 * @ClassName Son
 * @Description
 * @Author yangkang
 * @Date 2020/3/26 22:41
 * @Version 1.0
 **/
public class Son extends Parent {
    public int num = 20;
    public Son() {
        System.out.println("son");
    }

    public void show() {
        int num = 30;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }
}
