package basic._0429_thread_pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/**
 * @ClassName ThreadPool
 * @Description 线程池
 * @Author yk
 * @Date 2020/4/29 22:17
 * @Version 1.0
 **/
public class ThreadPool {
    public static void main(String[] args) {
        ExecutorService service1 = Executors.newFixedThreadPool(10);

        ExecutorService service2 = Executors.newSingleThreadExecutor();

        ExecutorService service3 = Executors.newCachedThreadPool();

        ScheduledExecutorService service4 = Executors.newScheduledThreadPool(10);


    }
}
