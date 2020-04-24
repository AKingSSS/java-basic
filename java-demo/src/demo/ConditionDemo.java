package demo;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName ConditionDemo
 * @Description
 * @Author yangkang
 * @Date 2020/4/15 15:21
 * @Version 1.0
 **/
public class ConditionDemo {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        Condition condition = lock.newCondition();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    lock.lock();
                    condition.await();
                    System.out.println("在");
                }catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    lock.lock();
                    System.out.println("在？");
                    Thread.sleep(1000);
                    condition.signal();
                }catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        }).start();


    }
}
