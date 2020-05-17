package java8.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

/**
 * @ClassName Stream01
 * @Description
 * @Author yk
 * @Date 2020/5/15 17:18
 * @Version 1.0
 **/
public class Stream06 {
    public static void main(String[] args) {
        final List<Person> personList = Arrays.asList(
                new Person(1L, "Python大星", 18),
                new Person(1L, "康师傅", 15),
                new Person(1L, "光头强", 25));
        System.out.println("==== count 方法====");
        final long count = personList.stream().count();
        System.out.println("count = " + count);
        System.out.println("==== min 方法====");
        final Optional<Person> opt1 = personList.stream().min(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge().compareTo(o2.getAge());
            }
        });
        System.out.println("min = " + opt1.get());
        System.out.println("==== max 方法====");
        final Optional<Person> opt2 = personList.stream().max(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge().compareTo(o2.getAge());
            }
        });
        System.out.println("max = " + opt2.get());
        System.out.println("============ lambda  ============");
        final Optional<Person> opt3 = personList.stream().min((o1, o2) -> o1.getAge().compareTo(o2.getAge()));
        System.out.println("min = " + opt3.get());
        final Optional<Person> opt4 = personList.stream().max((o1, o2) -> o1.getAge().compareTo(o2.getAge()));
        System.out.println("max = " + opt4.get());
    }
}
