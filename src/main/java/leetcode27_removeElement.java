import java.util.Arrays;

public class leetcode27_removeElement {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        //            0 1 2 3 4 5 6 7 8
//        int[] nums = {1};
        int val = 2;
        System.out.println(removeElement(nums, val));
    }

    public static int removeElement(int[] nums, int val) {
        int startPos = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[startPos] = nums[i];
                startPos++;
            }
        }

        System.out.println(Arrays.toString(nums));
        return startPos;
    }
}