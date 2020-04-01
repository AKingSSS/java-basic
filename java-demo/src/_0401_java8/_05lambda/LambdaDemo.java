package _0401_java8._05lambda;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName Lambda01
 * @Description
 * @Author yangkang
 * @Date 2020/4/1 10:10
 * @Version 1.0
 **/
public class LambdaDemo {
    public static void main(String[] args) {
/*        //线程旧方法:
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程旧方法: Hello from thread");
            }
        }).start();

        //线程新方法:
        new Thread(
                () -> System.out.println("线程新方法: Hello from thread")
        ).start();*/

        //Old way
        List<Integer> oldList = Arrays.asList(1, 2, 3);
        for(Integer n: oldList) {
            System.out.println(n);
        }

        //New way:
        List<Integer> newList = Arrays.asList(1, 2, 3);
        newList.forEach(n -> System.out.println(n));


    }
}
