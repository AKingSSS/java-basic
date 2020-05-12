package basic._0429_thread_pool;

/**
 * @ClassName OneThread
 * @Description
 * @Author yk
 * @Date 2020/5/1 23:25
 * @Version 1.0
 **/
public class OneThread extends Thread{


    @Override
    public void run() {
        System.out.println(Thread.currentThread().getId());
    }

    public static void main(String[] args) {
        OneThread oneThread = new OneThread();
        oneThread.start();

    }

}
