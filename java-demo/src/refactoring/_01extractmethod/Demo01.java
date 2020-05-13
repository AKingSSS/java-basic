package refactoring._01extractmethod;

import java.util.*;

/**
 * @ClassName Demo01
 * @Description
 * @Author yk
 * @Date 2020/5/13 15:36
 * @Version 1.0
 **/
public class Demo01 {
    public void printAvg() {
        final Integer count = 1000;

        Integer sum = sum(count);

        printBanner();


        printDetails("sum: " + sum, "avg: " + Math.round(sum / count));

    }

    private Integer sum(Integer count) {
        Integer sum = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add(new Random().nextInt(count));
        }
        for (Integer i : list) {
            sum += i;
        }
        return sum;
    }

    private void printDetails(String s, String s2) {
        // print result
        System.out.println(s);
        System.out.println(s2);
    }

    private void printBanner() {
        printDetails("****************************", "******* 分隔符 ******");
        System.out.println("****************************");
    }

    public static void main(String[] args) {
        Demo01 demo = new Demo01();
        demo.printAvg();
    }
}
