package basic._0331_list;

import java.lang.reflect.Field;
import java.util.ArrayList;

/**
 * @ClassName ArrayListCapacityTest
 * @Description ArrayList初始容量测试
 * @Author yangkang
 * @Date 2020/3/31 16:22
 * @Version 1.0
 **/
public class ArrayListCapacityTest {

    public static int getCapacity(ArrayList arrayList) {
        try {
            Field elementDataField = ArrayList.class.getDeclaredField("elementData");
            elementDataField.setAccessible(true);
            return ((Object[]) elementDataField.get(arrayList)).length;
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
            return -1;
        }
    }

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        System.out.println("capacity: " + getCapacity(arrayList) + " size: " + arrayList.size());

        arrayList.add("test");
        System.out.println("capacity: " + getCapacity(arrayList) + " size: " + arrayList.size());

        arrayList = new ArrayList(11);
        System.out.println("capacity: " + getCapacity(arrayList) + " size: " + arrayList.size());
    }
}
