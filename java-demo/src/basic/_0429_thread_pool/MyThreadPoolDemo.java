package basic._0429_thread_pool;

import java.util.concurrent.*;

/**
 * @ClassName MyThreadPoolDemo
 * @Description
 * @Author yk
 * @Date 2020/4/30 21:12
 * @Version 1.0
 **/
public class MyThreadPoolDemo {
    public static void main(String[] args) {
        BlockingQueue<Runnable> queue = new ArrayBlockingQueue<>(10);
        ThreadFactory factory = r -> new Thread(r, "test-thread-pool");
        ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 5,
                0L, TimeUnit.SECONDS, queue, factory, new ThreadPoolExecutor.CallerRunsPolicy());
        for (int i = 0; i < 1000; i++) {
            executor.submit(() -> {
                try {
                    System.out.println(Thread.currentThread().getName() + ":执行任务");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
    }
}
