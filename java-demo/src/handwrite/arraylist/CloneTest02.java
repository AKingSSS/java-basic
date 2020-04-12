package handwrite.arraylist;

import java.util.ArrayList;

/**
 * @ClassName CloneTest01
 * @Description
 * @Author yangkang
 * @Date 2020/4/11 16:05
 * @Version 1.0
 **/
public class CloneTest02 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Teacher t1 = new Teacher("funny mum pee");
        t1.setCourse("数学");
        Teacher t2 = (Teacher) t1.clone();
        System.out.println(t1 == t2);
        System.out.println(t1);
        System.out.println(t2);

    }
}

