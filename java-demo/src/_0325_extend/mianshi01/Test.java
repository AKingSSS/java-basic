package _0325_extend.mianshi01;

/**
 * @ClassName Test
 * @Description
 * @Author yangkang
 * @Date 2020/3/26 22:46
 * @Version 1.0
 **/
public class Test {
    /**
     *     看程序写结果：
     *         A:访问成员变量的原则：就近原则。
     *         B:this和super的问题：
     *             this     访问本类的成员
     *             super    访问父类的成员(可以理解为的)
     *         C:子类的所有构造方法执行前默认先执行父类的无参构造方法。
     *         D:一个类的初始化过程：
     *             成员变量进行初始化过程如下：
     *                 默认初始化
     *                 显示初始化
     *                 构造方法初始化
     *
     *     输出的结果是：
     *         　　　　Parent
     *         　　　　son
     *         　　　　30
     *         　　　　20
     *         　　　　10
     */
    public static void main(String[] args) {
        Son son = new Son();
        son.show();
    }
}
