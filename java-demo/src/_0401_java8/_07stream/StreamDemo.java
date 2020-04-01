package _0401_java8._07stream;

import java.util.stream.Stream;

/**
 * @ClassName StreamDemo
 * @Description
 * @Author yangkang
 * @Date 2020/4/1 11:48
 * @Version 1.0
 **/
public class StreamDemo {
    public static void main(String[] args) {
        Stream.of("apple", "banana", "orange", "grape")
                .map(e -> e.length()) //转成单词的长度 int
                .forEach(e -> System.out.println(e)); //输出

        Stream.of("apple", "banana", "orange", "grape")
                .map(String::length) //转成单词的长度 int
                .forEach(System.out::println);

        Stream.of("a-b-c-d", "e-f-i-g-h")
                .flatMap(e -> Stream.of(e.split("-")))
                .forEach(e -> System.out.println(e));

        Stream.of(1, 2, 3, 4, 5, 6)
                .limit(3) //限制三个
                .forEach(e -> System.out.println(e)); //将输出 前三个 1，2，3

        Stream.of(1, 2, 3, 1, 2, 5, 6, 7, 8, 0, 0, 1, 2, 3, 1)
                .filter(e -> e >= 5) //过滤小于5的
                .forEach(e -> System.out.println(e));

    }
}
