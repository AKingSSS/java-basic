package java8.stream;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @ClassName Stream01
 * @Description
 * @Author yk
 * @Date 2020/5/15 17:18
 * @Version 1.0
 **/
public class Stream09 {
    public static void main(String[] args) {
        final List<Person> list1 = Arrays.asList(
                new Person(1L, "Python大星", 18),
                new Person(2L, "康师傅", 15),
                new Person(3L, "光头强", 25));

        final List<Person> list2 = Arrays.asList(
                new Person(4L, "Python小星", 18),
                new Person(5L, "统一", 15),
                new Person(6L, "路飞", 25));

        /**
         * concat 拼接流
         */
        final Stream<Person> personStream = Stream.concat(list1.stream(), list2.stream());
        personStream.forEach(p -> System.out.println("p = " + p));
    }
}
