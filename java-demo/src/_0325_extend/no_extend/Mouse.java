package _0325_extend.no_extend;

/**
 * @ClassName Mouse
 * @Description
 * @Author yangkang
 * @Date 2020/3/26 17:55
 * @Version 1.0
 **/
public class Mouse {
    private String name;
    private int id;

    public Mouse(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void eat() {
        System.out.println(name + " 正在吃 ");
    }

    public void sleep() {
        System.out.println(name + " 正在睡 ");
    }

    public void introduction() {
        System.out.println(" 大家好！我是 " + id + " 号 " + name + ".");
    }
}
