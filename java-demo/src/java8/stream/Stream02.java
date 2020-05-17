package java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @ClassName Stream01
 * @Description
 * @Author yk
 * @Date 2020/5/15 17:18
 * @Version 1.0
 **/
public class Stream02 {
    public static void main(String[] args) {
        final List<Person> personList = Arrays.asList(
                new Person(1L, "Python大星", 18),
                new Person(1L, "康师傅", 27),
                new Person(1L, "光头强", 30));
        /**
         * 匿名内部类
         */
        System.out.println("====通过匿名内部类实现filter过滤的方法====");
        personList.stream().filter(new Predicate<Person>() {
            @Override
            public boolean test(Person person) {
                return person.getAge() > 18;
            }
        }).forEach(person -> System.out.println("p = " + person));
        /**
         * lambda
         */
        System.out.println("====通过lambda表达式实现filter过滤的方法====");
        personList.stream().filter(person -> {
            return person.getAge() > 18;
        }).forEach(person -> System.out.println("p = " + person));

        /**
         * lambda 简化
         */
        System.out.println("====通过lambda表达式简化实现filter过滤的方法====");
        personList.stream().filter(p -> p.getAge() > 18).forEach(person -> System.out.println("p = " + person));
    }
}
