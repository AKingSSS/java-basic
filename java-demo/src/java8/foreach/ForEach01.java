package java8.foreach;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName ForEach01
 * @Description
 * @Author yk
 * @Date 2020/5/15 16:40
 * @Version 1.0
 **/
public class ForEach01 {
    public static void main(String[] args) {
        // java 8 以前的写法
        Map<String, Integer> items = new HashMap<>();
        items.put("A", 10);
        items.put("B", 20);
        items.put("C", 30);
        items.put("D", 40);
        items.put("E", 50);
        items.put("F", 60);

        System.out.println("------------------------------");
        for (Map.Entry<String, Integer> entry : items.entrySet()) {
            System.out.println("key = " + entry.getKey() + "; value = " + entry.getValue());
        }
        System.out.println("------------------------------");

        /**
         * 使用 java 8 新特性
         */
        System.out.println("------------------------------");
        items.forEach((k,v)->{
            System.out.println("key = " + k + "; value = " + v);
        });
        System.out.println("------------------------------");
    }
}
