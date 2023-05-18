import java.util.*;

public class LeetCode26_removeDuplicates {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
//        int[] nums = {1, 1, 2};
        System.out.println("Unique nums: " + removeDuplicates(nums));
    }

    static int removeDuplicates(int[] nums) {
        int start = nums[0];
        int end;
        int startPos = 0;
        for (int i = 1; i < nums.length; i++) {
            end = nums[i];
            if (start != end) {
                nums[startPos + 1] = end;
                startPos++;
                start = nums[startPos];
            }
        }
        System.out.println(Arrays.toString(nums));
        return startPos + 1;
    }
}
