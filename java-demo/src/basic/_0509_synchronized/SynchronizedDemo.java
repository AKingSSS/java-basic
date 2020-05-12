package basic._0509_synchronized;

import java.security.PublicKey;

/**
 * @ClassName SynchronizedDemo
 * @Description
 * @Author yk
 * @Date 2020/5/9 14:44
 * @Version 1.0
 **/
public class SynchronizedDemo {
    private static Object obj = new Object();
    public static void main(String[] args) {
        synchronized (obj) {
            System.out.println("1");
        }
    }
}
