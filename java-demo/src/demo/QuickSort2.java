package demo;

/**
 * @ClassName QuickSort2
 * @Description
 * @Author yangkang
 * @Date 2020/4/15 14:34
 * @Version 1.0
 **/
public class QuickSort2 {
    public static void sort(int[] arr, int left, int right) {
        if (left > right) {
            return;
        }
        int i, j, p, temp;
        i = left;
        j = right;
        p = arr[left];

        while (i < j) {
            while (arr[j] >= p && i < j) {
                j--;
            }
            while (arr[i] <= p && i < j) {
                i++;
            }
            if (i < j) {
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = arr[j];
            }
        }
        // 将基准值与i和j相等时互相调换
        arr[left] = arr[i];
        arr[j] = p;
    }


    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 2, 7};
        sort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + ",");
        }
    }
}
