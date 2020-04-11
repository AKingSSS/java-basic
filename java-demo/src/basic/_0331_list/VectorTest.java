package basic._0331_list;

import java.util.List;
import java.util.Random;
import java.util.Vector;

/**
 * @ClassName Vector
 * @Description
 * @Author yangkang
 * @Date 2020/3/31 21:19
 * @Version 1.0
 **/
public class VectorTest {
    public static void main(String[] args) throws InterruptedException {
        List v = new Vector();
        v.add(1);
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    v.add(0, new Random().nextInt(100));
                }
            }).start();
        }
        Thread.sleep(1000);
        System.out.println(v.size());
    }
}
