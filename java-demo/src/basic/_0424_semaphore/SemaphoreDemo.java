package basic._0424_semaphore;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * @ClassName SemaphoreDemo
 * @Description
 * @Author yangkang
 * @Date 2020/4/24 0:44
 * @Version 1.0
 **/
public class SemaphoreDemo {
    public static void main(String[] args) {
        // 假设火车站只有三个坑
        Semaphore semaphore = new Semaphore(3);
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        semaphore.acquire();
                        System.out.println(Thread.currentThread().getName() + "：开始上厕所");
                        Thread.sleep(1000);
                        System.out.println(Thread.currentThread().getName() + "：结束上厕所");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        semaphore.release();
                    }
                }
            });
            thread.setName("thread" + i);
            thread.start();
        }
    }
}
