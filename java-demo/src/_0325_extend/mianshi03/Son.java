package _0325_extend.mianshi03;

/**
 * @ClassName Son
 * @Description
 * @Author yangkang
 * @Date 2020/3/26 22:41
 * @Version 1.0
 **/
public class Son extends Parent {
    int i = 2;

    @Override
    public void play() {
        System.out.println("喜欢踢足球");
    }

    public void read() {
        System.out.println("喜欢读三国演义");
    }

    public static void main(String[] args) {
        // 向上转型
        Parent p = new Son();
        // 调用的是 Son 的 play
        p.play();
        p.listen();
        System.out.println(p.i);
        // 向下转型
        p = (Son)p;
        ((Son) p).read();
        System.out.println(p.i);
    }
}
