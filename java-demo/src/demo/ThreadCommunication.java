package demo;

/**
 * @ClassName ThreadCommunication
 * @Description
 * @Author yangkang
 * @Date 2020/4/15 15:02
 * @Version 1.0
 **/
public class ThreadCommunication {
    public static void main(String[] args) {
        Object lock = new Object();
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {
                    try {
                        lock.wait();
                        System.out.println("hello");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {
                    System.out.println("hi");
                    lock.notify();
                }
            }
        }).start();

    }


}
