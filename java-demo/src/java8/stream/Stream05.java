package java8.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * @ClassName Stream01
 * @Description
 * @Author yk
 * @Date 2020/5/15 17:18
 * @Version 1.0
 **/
public class Stream05 {
    public static void main(String[] args) {
        final List<Person> personList = Arrays.asList(
                new Person(1L, "Python大星", 18),
                new Person(1L, "康师傅", 15),
                new Person(1L, "光头强", 25));
        System.out.println("====匿名内部类实现 sorted 方法：升序====");
        personList.stream().sorted (Comparator.comparing(new Function<Person, Integer>() {
            /**
             * 默认升序
             * @param person
             * @return
             */
            @Override
            public Integer apply(Person person) {
                return person.getAge();
            }
        })).forEach(p->System.out.println("p = " + p));

        System.out.println("====匿名内部类实现 sorted 方法：降序====");
        personList.stream().sorted (Comparator.comparing(new Function<Person, Integer>() {
            /**
             * 降序
             * @param person
             * @return
             */
            @Override
            public Integer apply(Person person) {
                return person.getAge();
            }
        }).reversed()).forEach(p->System.out.println("p = " + p));

        System.out.println("==== lambda 实现 sorted 方法：升序====");
        personList.stream().sorted (Comparator.comparing(p->p.getAge())).forEach(p->System.out.println("p = " + p));
        System.out.println("==== lambda 实现 sorted 方法：降序序====");
        // 需要显性显示数据类型
        personList.stream().sorted (Comparator.comparing((Person p)->p.getAge()).reversed()).
                forEach(p->System.out.println("p = " + p));

        System.out.println("==== lambda  简化实现 sorted 方法：降序序====");
        personList.stream().sorted (Comparator.comparing(Person::getAge).reversed()).
                forEach(p->System.out.println("p = " + p));
    }
}
