package basic._0509_synchronized;

/**
 * @ClassName SynchronizedDemo
 * @Description
 * @Author yk
 * @Date 2020/5/9 14:44
 * @Version 1.0
 **/
public class SynchronizedDemo2 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (SynchronizedDemo2.class) {
                    System.out.println("我是run方法");
                    test();
                }
            }

            public void test() {
                synchronized (SynchronizedDemo2.class) {
                    System.out.println("我是test方法");
                }
            }
        }).start();
    }
}
