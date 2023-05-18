import java.util.Arrays;

public class leetcode35_searchInsert {
    public static void main(String[] args) {

        System.out.println(searchInsert(new int[] {1, 3, 5, 6}, 2));

    }
    public static int searchInsert(int[] nums, int target) {
        // target: 5 - 2 - 7
        // output: 2 - 1 - 4
        if (Arrays.binarySearch(nums, target) < 0) {
            if (target < nums[0]) return 0;

            for (int i = 1; i < nums.length; i++) {
                if (nums[i - 1] < target && target < nums[i]) {
                    return i;
                }
            }
             if (nums[nums.length - 1] < target) {
                 return nums.length;
             }
        }
        return (Arrays.binarySearch(nums, target));
    }

}
