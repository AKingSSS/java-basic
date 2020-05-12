package basic._0509_synchronized;

/**
 * @ClassName SynchronizedDemo
 * @Description
 * @Author yk
 * @Date 2020/5/9 14:44
 * @Version 1.0
 **/
public class UninterruptibleDemo {
    public static void main(String[] args) throws InterruptedException {
        // 1、定义一个runnable
        Runnable run = new Runnable() {
            @Override
            public void run() {
                // 2.在Runnable定义同步代码块
                synchronized (UninterruptibleDemo.class) {
                    System.out.println(Thread.currentThread().getName() + "进入同步代码块");
                    // 保证不退出同步代码块
                    try {
                        Thread.sleep(1000000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        // 3.先开启一个线程来执行同步代码块
        Thread t1 = new Thread(run);
        t1.start();
        Thread.sleep(1000);
        // 4.后开启一个线程来执行同步代码块(阻塞状态)
        Thread t2 = new Thread(run);
        t2.start();

        // 5.停止线程
        System.out.println("停止线程前");
        t2.interrupt();
        System.out.println("停止线程后");

        System.out.println("t1.getState() = " + t1.getState());
        System.out.println("t2.getState() = " + t2.getState());
    }
}
