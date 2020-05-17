package java8.stream;

import java.util.Arrays;
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
public class Stream04 {
    public static void main(String[] args) {
        final List<List<Integer>> list = Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(4,5,6),
                Arrays.asList(7,8,9));
        System.out.println("====匿名内部类实现flatMap方法====");
        Stream<Integer> stream1 = list.parallelStream().flatMap(new Function<List<Integer>, Stream<? extends Integer>>() {
            @Override
            public Stream<? extends Integer> apply(List<Integer> integers) {
                return integers.stream();
            }
        });
        stream1.forEach(x->System.out.println("x = " + x));
        System.out.println("====lambda实现flatMap方法====");
        Stream<Integer> stream2 = list.parallelStream().flatMap(t->t.stream());
        stream2.forEach(x->System.out.println("x = " + x));

    }
}
