package handwrite.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName ArrayListTimeDemo
 * @Description
 * @Author yangkang
 * @Date 2020/4/11 19:30
 * @Version 1.0
 **/
public class ArrayListTimeDemo {
    public static void main(String[] args) {
        // 创建 ArrayList 集合
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            list.add(i + "a");
        }

        // 测试随机访问时间
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("测试随机访问时间 = " + (endTime - startTime));

        // 测试顺序访问时间
        startTime = System.currentTimeMillis();
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next();
        }
        endTime = System.currentTimeMillis();
        System.out.println("测试顺序访问时间 = " + (endTime - startTime));
    }
}
