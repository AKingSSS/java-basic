package handwrite.arraylist;

import java.util.ArrayList;

/**
 * @ClassName CloneTest01
 * @Description
 * @Author yangkang
 * @Date 2020/4/11 16:05
 * @Version 1.0
 **/
public class CloneTest01 {
    public static void main(String[] args) {
        Student s1 = new Student("Python 大星",18);
        Student s2 = new Student("Python 小星",18);
        Student s3 = new Student("Python 胖虎",18);
        Student s4 = new Student("Python 章鱼博士",18);

        // 创建ArrayList
        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        // 调用方法进行克隆
        ArrayList<Student> list1 = (ArrayList<Student>) list.clone();
        System.out.println(list1 == list);
        System.out.println(list);
        System.out.println(list1);

    }
}

