package _0401_java8._01interface;

/**
 * @ClassName InterfaceTest
 * @Description java8 新特性
 * 允许默认方法、静态方法、静态常量
 * @Author yangkang
 * @Date 2020/4/1 9:20
 * @Version 1.0
 **/
public interface InterfaceTest {
    /**
     * 静态常量，必须 static final 修饰
     */
    static final String NAME = "Python大星";

    /**
     * 默认方法
     */
    default void say() {
        System.out.println("我是Python大星");
    }

    /**
     * 可以有默认方法
     */
    default void sing() {
        System.out.println("Python大星在唱歌");
    }

    /**
     * 静态方法
     */
    static void run() {
        System.out.println("Python大星在跑步");
    }
}
