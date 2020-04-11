package basic._0319_chengxukongzhi;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Java8ForEach
 * @Description java8的新特性，循环 list和 map
 * @Author Python大星
 * @Date 2020/3/19 15:53
 * @Version 1.0
 **/
public class Java8ForEach {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        items.add("A");
        items.add("B");
        items.add("C");
        items.add("D");
        items.add("E");
        items.forEach(item->System.out.println(item));
    }
}
