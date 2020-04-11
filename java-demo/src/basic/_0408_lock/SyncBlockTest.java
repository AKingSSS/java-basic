package basic._0408_lock;

/**
 * @ClassName SyncBlockTest
 * @Description
 * @Author yangkang
 * @Date 2020/4/8 23:35
 * @Version 1.0
 **/
public class SyncBlockTest implements Runnable {
    /**
     * 共享资源变量
     */
    int count = 0;

    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + ":" + count++);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        SyncBlockTest sync1 = new SyncBlockTest();
        SyncBlockTest sync2 = new SyncBlockTest();
        Thread thread1 = new Thread(sync1, "thread1");
        Thread thread2 = new Thread(sync2, "thread2");
        thread1.start();
        thread2.start();
    }
}
