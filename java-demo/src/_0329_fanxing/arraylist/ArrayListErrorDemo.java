package _0329_fanxing.arraylist;

import sun.rmi.runtime.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ArrayListErrorDemo
 * @Description ArrayList 错误用法
 * @Author yangkang
 * @Date 2020/3/29 11:41
 * @Version 1.0
 **/
public class ArrayListErrorDemo {
    public static void main(String[] args) {
        List arrayList = new ArrayList();
        arrayList.add("Python大星");
        arrayList.add(100);

        for(int i = 0; i< arrayList.size();i++){
            String item = (String)arrayList.get(i);
            System.out.println("item = " + item);
        }
    }
}
