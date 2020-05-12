package basic._0502_thread;

/**
 * @ClassName MyThread
 * @Description
 *  验证 voliate 的非原子性操作
 *
 * @Author yk
 * @Date 2020/5/2 12:31
 * @Version 1.0
 **/
public class MyThreadVolatile2 {
    public static int i = 0;

    public static void main(String[] args) {
        for (int j = 0; j < 100; j++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int k = 0; k < 1000; k++) {
                        synchronized (MyThreadVolatile2.class) {
                            i++;
                            System.out.println(Thread.currentThread().getName() + ": i ========>>>>" + i);
                        }
                    }
                }
            },"第" + j + "线程").start();
        }
    }
}
