package basic._0331_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName SynchronizedListTest
 * @Description
 * @Author yangkang
 * @Date 2020/4/8 13:07
 * @Version 1.0
 **/
public class SynchronizedListTest {
    public static void main(String[] args) {
        List<String> list = Collections.synchronizedList(new ArrayList<String>());
        list.add("1");
        list.add("2");
        list.add("3");

        synchronized (list) {
            // Must be in synchronized block
            Iterator i = list.iterator();
            while (i.hasNext()) {
                //foo(i.next());
                System.out.println(i.next());
            }

        }
    }
}
