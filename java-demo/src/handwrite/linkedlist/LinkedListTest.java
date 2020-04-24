package handwrite.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName LinkedListTest
 * @Description
 * @Author yangkang
 * @Date 2020/4/14 15:20
 * @Version 1.0
 **/
public class LinkedListTest {
    public static void main(String[] args) {
        /*LinkedList<String> list = new LinkedList<>();
        
        list.add("python");
        list.add("java");

        list.remove();
        for (String s : list) {
            System.out.println(s);
        }*/

        List<String> list = new ArrayList<String>();
        LinkedList<String> link = new LinkedList<String>();
        //生产数据
        for (int i = 0; i < 100000; i++) {
            list.add("dfghdffdhghdfghdfghians" + i);
            link.add("dfghdffdhghdfghdfghians" + i);
        }
        //标记开始时间
        long startlist = System.currentTimeMillis();
        //在list中间插入数据
        for (int i = 0; i < 10000; i++) {
            list.add(( 9999 + i), "asdfasdfaasdf");
        }
        //标记结束时间
        long endlist = System.currentTimeMillis();
        System.out.println("list time ----- " + (endlist - startlist));

        //标记开始时间
        long startLink = System.currentTimeMillis();
        //在link中间插入数据
        for (int i = 0; i < 10000; i++) {
            link.add(( 9999 + i), "asdfasdfaasdf");
        }
        //标记结束时间
        long endLink = System.currentTimeMillis();
        System.out.println("link time ----- " + (endLink - startLink));
    }
}
