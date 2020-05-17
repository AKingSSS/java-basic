package java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

/**
 * @ClassName Stream01
 * @Description
 * @Author yk
 * @Date 2020/5/15 17:18
 * @Version 1.0
 **/
public class Stream10 {
    public static void main(String[] args) {
        final List<Person> list = Arrays.asList(
                new Person(1L, "Python大星", 18),
                new Person(2L, "康师傅", 15),
                new Person(3L, "光头强", 25));
        /**
         * 统计年龄总和
         */
        System.out.println("==== 匿名内部类 求和 ====");
        final Optional<Integer> opt1 = list.stream().map(Person::getAge).reduce(new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer1, Integer integer2) {
                System.out.println("integer1 = " + integer1 + ";integer2 = " + integer2);
                return integer1 + integer2;
            }
        });
        System.out.println("sum = " + opt1.get());
        System.out.println("==== lambda 求和 ====");
        final Optional<Integer> opt2 = list.stream().map(Person::getAge).reduce((integer1, integer2) -> integer1 + integer2);
        System.out.println("sum = " + opt2.get());
    }
}
