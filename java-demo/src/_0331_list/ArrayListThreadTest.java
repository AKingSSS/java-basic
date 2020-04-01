package _0331_list;

import java.util.ArrayList;

/**
 * @ClassName ArrayListThreadTest
 * @Description
 * @Author yangkang
 * @Date 2020/3/31 20:41
 * @Version 1.0
 **/
public class ArrayListThreadTest {
    public static void main(String[] args) throws InterruptedException {
        ArrayList arrayList = new ArrayList();
        // 开启 10 个线程
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 100; j++) {
                        arrayList.add(j);
                    }
                }
            }).start();
        }
        Thread.sleep(1000);
        System.out.println(arrayList.size());
    }
}
