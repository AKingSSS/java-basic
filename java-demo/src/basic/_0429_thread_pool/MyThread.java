package basic._0429_thread_pool;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @ClassName MyThread
 * @Description
 * @Author yk
 * @Date 2020/4/30 13:43
 * @Version 1.0
 **/
public class MyThread implements Callable<String> {

    @Override
    public String call() throws Exception {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }

        return Thread.currentThread().getName() + ": success";
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /**
         *【1】创建 Callable 接口的实现类，并实现 call () 方法，
         * 然后创建该实现类的实例（从 java8 开始可以直接使用 Lambda 表达式创建 Callable 对象）。
         *
         *【2】使用 FutureTask 类来包装 Callable 对象，该 FutureTask 对象封装了 Callable 对象的 call () 方法的返回值
         *
         *【3】使用 FutureTask 对象作为 Thread 对象的 target 创建并启动线程（因为 FutureTask 实现了 Runnable 接口）
         *
         *【4】调用 FutureTask 对象的 get () 方法来获得子线程执行结束后的返回值
         */
        MyThread myThread = new MyThread();
        FutureTask<String> futureTask = new FutureTask<>(myThread);
        Thread t1 = new Thread(futureTask, "线程1");
        t1.start();
        System.out.println(futureTask.get());
    }
}
