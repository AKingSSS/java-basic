package java8.foreach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @ClassName ForEach01
 * @Description
 * @Author yk
 * @Date 2020/5/15 16:40
 * @Version 1.0
 **/
public class ForEach03 {
    public static void main(String[] args) {
        final List<String> list = Arrays.asList("Python大星", "康师傅", "小白");
        /**
         * 普通方法遍历
         */
        System.out.println("====普通方法遍历====");
        for (String s : list) {
            System.out.println("s = " + s);
        }

        /**
         * 匿名内部类的遍历集合
         */
        System.out.println("====匿名内部类的遍历集合====");
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("s = " + s);
            }
        });

        /**
         * lambda 表达式的 foreach 遍历集合
         */
        System.out.println("====lambda的foreach遍历集合====");
        list.forEach(s -> System.out.println("s = " + s));
    }
}
