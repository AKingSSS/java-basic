package refactoring._01extractmethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @ClassName Demo00
 * @Description
 * @Author yk
 * @Date 2020/5/13 15:56
 * @Version 1.0
 **/
public class Demo00 {
    public void printAvg() {
        Integer sum = 0;
        final Integer count = 1000;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add(new Random().nextInt(count));
        }

        System.out.println("****************************");
        System.out.println("******* 分隔符 ******");
        System.out.println("****************************");

        for (Integer i : list) {
            sum += i;
        }

        // print result
        System.out.println("sum: " + sum);
        System.out.println("avg: " + Math.round(sum / count));
    }

    public static void main(String[] args) {
        Demo00 demo = new Demo00();
        demo.printAvg();
    }
}
