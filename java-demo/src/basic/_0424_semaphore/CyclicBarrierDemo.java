package basic._0424_semaphore;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @ClassName CyclicBarrierDemo
 * @Description
 * @Author yangkang
 * @Date 2020/4/24 11:47
 * @Version 1.0
 **/
public class CyclicBarrierDemo {
    private final static int DRONGON_BALL_COUNT = 7;

    public static void main(String[] args) {

        CyclicBarrier cyclicBarrier = new CyclicBarrier(DRONGON_BALL_COUNT, () -> {
            System.out.println("集齐七颗龙珠，召唤神龙 ");
        });
        for (int i = 1; i < 8; i++) {
            final int finalI = i;
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + "收集到了 " + finalI + " 号龙珠");
                try {
                    cyclicBarrier.await();
                    System.out.println(Thread.currentThread().getName() + "收集到了 " + finalI + " 号龙珠");
                    cyclicBarrier.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }, "thread " + i).start();
        }
    }
}
