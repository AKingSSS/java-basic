package _0331_map.hashmap;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName HashMapDemo
 * @Description
 * @Author yangkang
 * @Date 2020/3/31 21:32
 * @Version 1.0
 **/
public class HashMapDemo {
    public static int getCapacity(HashMap hashMap) {
        try {
            Field elementDataField = ArrayList.class.getDeclaredField("elementData");
            elementDataField.setAccessible(true);
            return ((Object[]) elementDataField.get(hashMap)).length;
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
            return -1;
        }
    }

    public static void main(String[] args) {
        Map map = new HashMap<>(10);

    }
}
