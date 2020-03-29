package _0329_fanxing.arraylist;

import sun.rmi.runtime.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ArrayListDemo
 * @Description
 * @Author yangkang
 * @Date 2020/3/29 14:21
 * @Version 1.0
 **/
public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();

        Class stringListClass = stringList.getClass();
        Class integerListClass = integerList.getClass();
        System.out.println(stringListClass);
        System.out.println(integerListClass);

        if(stringListClass.equals(integerListClass)){
            System.out.println("泛型测试,类型相同");
        }
    }
}
