package _0325_extend.mianshi02;

/**
 * @ClassName Test
 * @Description
 * @Author yangkang
 * @Date 2020/3/26 22:46
 * @Version 1.0
 **/
public class Test {
    /**
     *    看程序写结果：
     *         A:一个类的静态代码块,构造代码块,构造方法的执行流程：
     *             静态代码块 > 构造代码块 > 构造方法
     *         B:静态的内容是随着类的加载而加载，
     *             即：静态代码块的内容会优先执行。
     *         C:构造代码块
     * 　           在类中方法外出现(即在类中的成员位置)，可以把多个构造方法方法中相同的代码存放到一起，用于对对象进行初始化，
     *             每次调用构造方法都执行，并且在构造方法前执行。
     *         C:子类的所有的构造方法默认都会去访问父类的无参构造方法。
     *
     *     输出结果是：
     *         　　静态代码块Fu
     *         　　静态代码块Zi
     *         　　构造代码块Fu
     *         　　构造方法Fu
     *         　　构造代码块Zi
     *        　　 构造方法Zi
     *
     */
    public static void main(String[] args) {
        Son son = new Son();
    }
}
