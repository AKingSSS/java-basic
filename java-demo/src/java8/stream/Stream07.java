package java8.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * @ClassName Stream01
 * @Description
 * @Author yk
 * @Date 2020/5/15 17:18
 * @Version 1.0
 **/
public class Stream07 {
    public static void main(String[] args) {
        final List<String> list = Arrays.asList("a", "b", "c", "d", "e", "f", "g");
        /**
         * skip 方法使用
         */
        System.out.println("==== skip ====");
        list.stream().skip(3).forEach(s -> System.out.println("s = " + s));
        /**
         * limit 方法使用
         */
        System.out.println("==== limit ====");
        list.stream().limit(3).forEach(s -> System.out.println("s = " + s));
        /**
         * skip 与 limit 组合实现分页
         */
        System.out.println("==== skip 与 limit 组合实现分页 ====");
        int skip = 0;
        int size = 2;
        for (int i = 0; i < list.size() / size + 1; i++) {
            skip = i * size;
            System.out.println("第 " + (i + 1) + " 页");
            list.stream().skip(skip).limit(size).forEach(s -> System.out.println("s = " + s));
        }
    }
}
