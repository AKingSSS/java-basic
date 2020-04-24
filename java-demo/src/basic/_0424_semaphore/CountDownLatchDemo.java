package basic._0424_semaphore;

import java.util.concurrent.CountDownLatch;

/**
 * @ClassName CountDownLatchDemo
 * @Description
 * @Author yangkang
 * @Date 2020/4/24 10:33
 * @Version 1.0
 **/
public class CountDownLatchDemo {
    public static void main(String[] args) {
        // 假设火车站厕所有 3 个坑
        CountDownLatch latch = new CountDownLatch(3);

        for (int i = 0; i < 3; i++) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println(Thread.currentThread().getName() + "：开始上厕所");
                        Thread.sleep(3000);
                        System.out.println(Thread.currentThread().getName() + "：结束上厕所");
                        latch.countDown();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            thread.setName("thread" + i);
            thread.start();
        }

        try {
            System.out.println("等待 3 个人上完厕所...");
            latch.await();
            System.out.println("3 个人已经都上完厕所");
            System.out.println("清洁工进去打扫卫生");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
