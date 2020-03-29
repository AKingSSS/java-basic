package _0329_fanxing.array;

/**
 * @ClassName ArrayDemo
 * @Description 数组
 * @Author yangkang
 * @Date 2020/3/29 10:47
 * @Version 1.0
 **/
public class ArrayDemo {
    public static void main(String[] args) {
        /**
         * 定义：数组是数据类型相同的，用一个标志符名称封装在一起的一个对象序列
         * 或基本类型数据序列（一组相同数据类型元素的集合，并且分配一块连续的内存来存储）。
         *
         * 格式：int [] a1（常用）  或者 int a1 []
         *
         * 初始化：方法一：int [] a1 = {1,3,5,7,9}
         *
         * 　　　　方法二・：int [] a1 = new int [5]
         */

        int[] a = new int[5];
        a[0] = 10;
        System.out.println(a[1]);

        String[] b = new String[5];
        b[0] = "Python大星";
        System.out.println(b[1]);
    }
}
