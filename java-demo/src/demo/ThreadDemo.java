package demo;

import java.util.concurrent.Semaphore;

/**
 * @ClassName ThreadDemo
 * @Description 使用两个线程交替打印奇偶数
 * @Author yangkang
 * @Date 2020/4/15 16:49
 * @Version 1.0
 **/
public class ThreadDemo {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);

        new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                try {
                    semaphore.acquire();
                    while (true) {
                        if (i % 2 == 0) {
                            System.out.println(i);
                            semaphore.release();
                            Thread.sleep(1000);
                        }
                        i++;
                    }

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                try {
                    semaphore.acquire();
                    while (true) {
                        if (i % 2 != 0) {
                            System.out.println(i++);
                            semaphore.release();
                            Thread.sleep(1000);
                        }
                        i++;
                    }

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }).start();

    }
}
