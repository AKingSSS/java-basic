package demo;

/**
 * @ClassName DeadLock2
 * @Description
 * @Author yangkang
 * @Date 2020/4/15 14:59
 * @Version 1.0
 **/
public class DeadLock2 {
    public static void main(String[] args) {
        String s1 = "a";
        String s2 = "b";

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (s1) {
                    try {
                        System.out.println("获取s1的锁");
                        Thread.sleep(1000);
                        synchronized (s2) {
                            System.out.println("ab");
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (s2) {
                    try {
                        System.out.println("获取s2的锁");
                        Thread.sleep(1000);
                        synchronized (s1) {
                            System.out.println("ba");
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}
