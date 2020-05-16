package basic._0510_syn_map;

import java.util.*;

/**
 * @ClassName SynchronizedMapDemo
 * @Description
 * @Author aking
 * @Date 2020/5/10 23:12
 * @Version 1.0
 **/
public class SynchronizedMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map =
                Collections.synchronizedMap(new HashMap<String, Integer>(16));

        Hashtable hashtable = new Hashtable();
        hashtable.put(null,"123");
    }
}
