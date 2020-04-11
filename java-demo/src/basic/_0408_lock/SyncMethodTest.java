package basic._0408_lock;

/**
 * @ClassName SyncMethodTest
 * @Description
 * @Author yangkang
 * @Date 2020/4/8 23:27
 * @Version 1.0
 **/
public class SyncMethodTest implements Runnable {
    /**
     * 共享资源变量
     */
    int count = 0;

    @Override
    public synchronized void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + count++);
        }
    }

    public static void main(String[] args) {
        SyncMethodTest sync = new SyncMethodTest();
        Thread thread1 = new Thread(sync,"thread1");
        Thread thread2 = new Thread(sync, "thread2");
        thread1.start();
        thread2.start();
    }
}
