package basic._0502_thread;

/**
 * @ClassName MyThread
 * @Description
 * @Author yk
 * @Date 2020/5/2 12:31
 * @Version 1.0
 **/
public class MyThread {
    public static boolean flag = false;
    public static int i = 0;

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                    flag = true;
                    System.out.println("flag modified true");
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }).start();

        while (!flag) {
            i++;
        }
        System.out.println("i = " + i);
    }
}
