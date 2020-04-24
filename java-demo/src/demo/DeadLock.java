package demo;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * @ClassName DeadLock
 * @Description
 * @Author yangkang
 * @Date 2020/4/15 14:47
 * @Version 1.0
 **/
public class DeadLock {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (obj1) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (obj2) {
                        System.out.println(Thread.currentThread() + ":执行");
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (obj2) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (obj1) {
                        System.out.println(Thread.currentThread() + "：执行");
                    }
                }
            }
        }).start();
    }
}
