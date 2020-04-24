package basic._0423_threadlocal;

/**
 * @ClassName InheritableThreadLocalDemo
 * @Description
 * @Author yangkang
 * @Date 2020/4/23 20:47
 * @Version 1.0
 **/
public class InheritableThreadLocalDemo {
    private static ThreadLocal<String> inheritableThreadLocal = new InheritableThreadLocal<>();
    private static ThreadLocal<String> threadLocal = new ThreadLocal<>();

    public static void main(String[] args) {
        // 主线程
        inheritableThreadLocal.set("inheritableThreadLocal");
        threadLocal.set("threadLocal");
        // 启动子线程
        Thread thread = new Thread(() -> {
            // 子线程输出父线程的threadLocal 变量值
            System.out.println("子线程 inheritableThreadLocal.get(): " + inheritableThreadLocal.get());
            System.out.println("子线程 threadLocal.get(): " + threadLocal.get());
        });

        thread.start();

        System.out.println("main inheritableThreadLocal.get(): " + inheritableThreadLocal.get());
        System.out.println("main threadLocal.get(): " + threadLocal.get());

    }
}
