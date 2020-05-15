package java8.foreach;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName ForEach01
 * @Description
 * @Author yk
 * @Date 2020/5/15 16:40
 * @Version 1.0
 **/
public class ForEach02 {
    public static void main(String[] args) {
        // java 8 以前的写法
        List<String> items = new ArrayList<>();
        items.add("A");
        items.add("B");
        items.add("C");
        items.add("D");
        items.add("E");
        items.add("F");

        System.out.println("------------------------------");
        for (String item : items) {
            System.out.println("item = " + item);
        }
        System.out.println("------------------------------");

        /**
         * 使用 java 8 新特性
         */
        System.out.println("------------------------------");
        items.forEach(item->System.out.println("item = " + item));
        System.out.println("------------------------------");

        System.out.println("------------------------------");
        items.forEach(System.out::println);
        System.out.println("------------------------------");
    }
}
