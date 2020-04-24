package demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName QuickSort
 * @Description
 * @Author yangkang
 * @Date 2020/4/15 13:17
 * @Version 1.0
 **/
public class QuickSort {

    public static void quickSort(int[] arr, int left, int right) {
        if (left > right) {
            return;
        }
        int i, j, temp;
        i = left;
        j = right;
        // 取第一个值为基准值
        int p = arr[left];

        while (i < j) {
            // 先比较右边，找出比基准值大的数
            while (arr[j] >= p && i < j) {
                j--;
            }
            while (arr[i] <= p && i < j) {
                i++;
            }
            //如果满足条件则交换
            if (i < j) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //将基准值与i和j相等的地方交换
        arr[left] = arr[i];
        arr[i] = p;
        // 递归调用
        quickSort(arr, left, j - 1);
        quickSort(arr, j + 1, right);
    }


    public static void main(String[] args) {
        int[] array = {1, 5, 2, 7, 3, 8};
        quickSort(array, 0, array.length - 1);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
    }
}
