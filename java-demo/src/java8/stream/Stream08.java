package java8.stream;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * @ClassName Stream01
 * @Description
 * @Author yk
 * @Date 2020/5/15 17:18
 * @Version 1.0
 **/
public class Stream08 {
    public static void main(String[] args) {
        final List<String> list = Arrays.asList("a", "b", "c", "d", "e", "f", "g");
        System.out.println("==== list 转字符串 ====");
        final String s1 = list.stream().collect(Collectors.joining(""));
        final String s2 = list.stream().collect(Collectors.joining(","));
        final String s3 = list.stream().collect(Collectors.joining(",","[","]"));
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
        System.out.println("==== 匿名内部类 list 转 LinkedList ====");
        final LinkedList list1 = list.stream().collect(Collectors.toCollection(new Supplier<LinkedList>() {
            @Override
            public LinkedList get() {
                return new LinkedList<String>();
            }
        }));
        list1.forEach(s->System.out.println("s = " + s));
        System.out.println("==== lambda list 转 LinkedList ====");
        final LinkedList<String> list2 = list.stream().collect(Collectors.toCollection(LinkedList::new));
        list2.forEach(s->System.out.println("s = " + s));
    }
}
