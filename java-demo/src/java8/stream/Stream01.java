package java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @ClassName Stream01
 * @Description
 * @Author yk
 * @Date 2020/5/15 17:18
 * @Version 1.0
 **/
public class Stream01 {
    public static void main(String[] args) {
        // 使用 Stream.forEach () 迭代
        Stream<String> stream = Stream.of("I", "love", "you", "too", "too");
//        stream.forEach(item->System.out.println(item));
//        stream.filter(item -> item.length() > 3).forEach(item -> System.out.println(item));
//        stream.distinct().forEach(item->System.out.println(item));
//        stream.sorted((s1,s2)->s1.length()-s2.length()).forEach(item->System.out.println(item));
//        stream.map(s -> s.toUpperCase()).forEach(item -> System.out.println(item));

//        Stream<List<Integer>> stream1 = Stream.of(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6));
//        stream1.flatMap(list -> list.stream()).forEach(i -> System.out.println(i));
/*        List<String> list = stream.map(s -> s.toUpperCase()).collect(Collectors.toList());
        list.stream().forEach(item->System.out.println(item));*/
//        stream.limit(3).forEach(item -> System.out.println(item));
        stream.skip(2).forEach(item -> System.out.println(item));

    }
}
