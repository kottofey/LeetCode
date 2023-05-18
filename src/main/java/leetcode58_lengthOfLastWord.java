public class leetcode58_lengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("   fly   me   to  the  moon   "));
    }                           //                 012345678901234567890123

    public static int lengthOfLastWord(String s) {

        System.out.println(s.strip().substring(s.strip().lastIndexOf(' ') + 1).length());

        int counter = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                counter++;
            }
            if (s.charAt(i) == ' ' && counter > 0) {
                return counter;
            }
        }
        return counter;
    }
}
