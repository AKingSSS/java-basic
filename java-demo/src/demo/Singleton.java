package demo;

/**
 * @ClassName Singleton
 * @Description
 * @Author yangkang
 * @Date 2020/4/15 14:42
 * @Version 1.0
 **/
public class Singleton {
    private volatile static Singleton singleton;
    /**
     * 私有化构造器
     */
    private Singleton() {

    }

    /**
     * 提供公共方法获取对象
     * @return
     */
    public static Singleton getInstance() {
        // 判断对象是否为空
        if (singleton == null) {
            synchronized (Singleton.class) {
                // 同时获取锁对象，只有一个能初始化
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

}
