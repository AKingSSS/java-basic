package basic._0502_thread;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName MyThread
 * @Description 使用原子类解决原子性操作问题
 * @Author yk
 * @Date 2020/5/2 12:31
 * @Version 1.0
 **/
public class MyThreadVolatile3 {
    public static AtomicInteger atomicInteger = new AtomicInteger(0);

    public static void main(String[] args) {
        for (int j = 0; j < 100; j++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int k = 0; k < 1000; k++) {
                        atomicInteger.incrementAndGet();
                        System.out.println(Thread.currentThread().getName() + ": atomicInteger ========>>>>" + atomicInteger.get());
                    }
                }
            }, "第" + j + "线程").start();
        }
    }
}
