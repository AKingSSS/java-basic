package basic._0424_gc;

import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.List;

/**
 * @ClassName GcDemo
 * @Description
 * @Author yangkang
 * @Date 2020/4/24 22:20
 * @Version 1.0
 **/
public class GcDemo {
    public static void main(String[] args) {
        List<GarbageCollectorMXBean> l = ManagementFactory.getGarbageCollectorMXBeans();
        for(GarbageCollectorMXBean g : l) {
            System.out.println(g.getName());
        }
    }
}
