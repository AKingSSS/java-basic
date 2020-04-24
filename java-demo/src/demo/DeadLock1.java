package demo;

/**
 * @ClassName DeadLock1
 * @Description
 * @Author yangkang
 * @Date 2020/4/15 14:55
 * @Version 1.0
 **/
public class DeadLock1 {
    public static void main(String[] args) {
        String s1 = "a";
        String s2 = "b";

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (s1) {
                    try {
                        System.out.println("获取锁s1");
                        Thread.sleep(1000);
                        synchronized (s2) {
                            System.out.println("ab");
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (s2) {
                    try {
                        System.out.println("获取锁s2");
                        Thread.sleep(1000);
                        synchronized (s1) {
                            System.out.println("ba");
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        t1.start();
        t2.start();
    }
}
