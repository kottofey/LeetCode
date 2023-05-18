import java.util.ArrayList;

public class leetcode28_strStr {
    public static void main(String[] args) {
        String haystack = "mississippi"; // return 4
        //                 01234567890
        String needle = "issip";

        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.startsWith(needle, i)) {
                return i;
            }
        }
        ArrayList<Integer> intArrayList = new ArrayList<>();
        return -1;
    }
}
