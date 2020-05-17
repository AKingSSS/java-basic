package java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @ClassName Stream01
 * @Description
 * @Author yk
 * @Date 2020/5/15 17:18
 * @Version 1.0
 **/
public class Stream03 {
    public static void main(String[] args) {
        final List<Person> personList = Arrays.asList(
                new Person(1L, "Python大星", 18),
                new Person(1L, "康师傅", 27),
                new Person(1L, "光头强", 30));
        /**
         * 匿名内部类实现map方法
         */
        System.out.println("====匿名内部类实现map方法====");
        personList.parallelStream().map(new Function<Person, Object>() {
            @Override
            public Object apply(Person person) {

                return person.getName();
            }
        }).forEach(p->System.out.println("p = " + p));
        System.out.println("====lambda实现map方法====");
        personList.parallelStream().map(p ->p.getName()).forEach(p->System.out.println("p = " + p));

    }
}
