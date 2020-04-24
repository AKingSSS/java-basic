package demo;

/**
 * @ClassName DuplicateRemove
 * @Description 快慢指针
 * @Author yangkang
 * @Date 2020/4/15 15:40
 * @Version 1.0
 **/
public class DuplicateRemove {

    private static int duplicateRemove(int[] nums) {
        if (nums.length == 0) return 0;
        // 定义慢指针
        int slow = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[slow] != nums[fast]) {
                slow++;
                nums[slow] = nums[fast];
            }
        }
        return slow;
    }

    public static void main(String[] args) {
        /**
         * 有序数组
         * 输入：nums = [1,2,2,3,3,3,4,5,6,6,7]
         * 输出：7
         */
        int[] nums = {1,2,2,3,3,3,4,5,6,6,7};
        duplicateRemove(nums);
    }


}

