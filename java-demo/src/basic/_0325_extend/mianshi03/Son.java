package basic._0325_extend.mianshi03;

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
        /**
         * 说明创建父类对象实现的时候用子类实现，此时这个对象的属性为父类的属性，不被子类覆盖。
         * 但如果子类实现的时候调用重写的方法，则父类的方法会被覆盖。
         * 总结：方法可重写，属性不可重写。父类的方法被子类覆盖，父类的属性不被子类覆盖。
         *
         * 变量不能被重写（覆盖），” 重写 “的概念只针对方法
         */
        // 向上转型
        Parent p = new Son();
        // 调用的是 Son 的 play
        p.play();
        p.listen();
        System.out.println(p.i);
/*        // 向下转型
        p = (Son)p;
        ((Son) p).read();
        System.out.println(p.i);*/
    }
}
