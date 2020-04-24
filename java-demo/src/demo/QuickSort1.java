package demo;

/**
 * @ClassName QuickSort1
 * @Description
 * @Author yangkang
 * @Date 2020/4/15 14:10
 * @Version 1.0
 **/
public class QuickSort1 {

    public static void sort(int[] arr, int left, int right) {
        // 判断
        if (left > right) {
            return;
        }
        int i, j, p, t;
        i = left;
        j = right;
        p = arr[left];
        while (i < j) {
            // 当右边数组值小于基准值p停止循环
            while (arr[j] >= p && i < j) {
                j--;
            }
            // 当左边数组值大于基准值p停止循环
            while (arr[i] <= p && i < j) {
                i++;
            }
            // 交换位置
            if (i < j) {
                t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }
        }
        // 基准值和 i和j相等时对应的值调换位置
        arr[left] = arr[i];
        arr[j] = p;

        // 递归调用
        sort(arr, left, j - 1);
        sort(arr, j + 1, right);

    }


    public static void main(String[] args) {
        int[] arr = {1, 7, 4, 5, 77, 2};
        sort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + ",");
        }
    }


}
