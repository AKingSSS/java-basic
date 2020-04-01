package _0331_string;

/**
 * @ClassName StringBuildDemo
 * @Description  为什么说StringBuild线程是不安全
 * @Author yangkang
 * @Date 2020/3/31 20:03
 * @Version 1.0
 **/
public class StringBuildDemo {

    public static void main(String[] args) throws InterruptedException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    sb.append("a");
                }
            }).start();
        }
        Thread.sleep(100);
        System.out.println(sb.length());
    }
}
