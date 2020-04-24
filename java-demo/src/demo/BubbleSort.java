package demo;

import java.util.Arrays;

/**
 * @ClassName BubbleSort
 * @Description
 * @Author yangkang
 * @Date 2020/4/15 12:24
 * @Version 1.0
 **/
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {1, 2, 5, 3, 2};
        // 临时变量
        int temp;
        int len = array.length;
        // 是否停止交换标识
        boolean flag = true;
        // 双层for循环
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    // 交换标识
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
        // 打印排序后的数组
        System.out.println(Arrays.toString(array));
    }
}
