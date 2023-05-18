import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LeetCode {
    public static void main(String[] args) {

        String[] i = {"{[]}", "(]", "()[]{}", "(){}}{"};
//        String[] i = {"()}{"};
        for (String str : i) System.out.println(isValid(str));
    }

    static boolean isValid(String s) {
        if (s.length() % 2 != 0 | Pattern.matches(".*[^(){}\\[\\]].*", s)) {
            return false;
        }

        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (map.containsValue(ch)) {
                stack.add(ch);
            } else {
                if (stack.isEmpty()) {
                return false;
                }
                if (map.get(ch) == stack.peek()) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return (stack.isEmpty());
    }

    static String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }

        int minLength = Integer.MAX_VALUE;
        char a = 0;
        char b;
        boolean flag = false;
        StringBuilder result = new StringBuilder();

        for (String str : strs) {
            minLength = Math.min(str.length(), minLength);
        }


        for (int i = 0; i < minLength; i++) { // every symbol
            for (int j = 0; j <= strs.length - 2; j++) { // of every word
                a = strs[j].charAt(i);
                b = strs[j + 1].charAt(i);
                if (a != b) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                flag = false;
                break;
            }
            result.append(a);
        }
        return result.toString();
    }

    static int romanToInt (String s) {
        HashMap<String, Integer> hashtable = new HashMap<>();
        hashtable.put("I", 1);
        hashtable.put("V", 5);
        hashtable.put("X", 10);
        hashtable.put("L", 50);
        hashtable.put("C", 100);
        hashtable.put("D", 500);
        hashtable.put("M", 1000);
        hashtable.put("IV", 4);
        hashtable.put("IX", 9);
        hashtable.put("XL", 40);
        hashtable.put("XC", 90);
        hashtable.put("CD", 400);
        hashtable.put("CM", 900);
        hashtable.put(" ", 0);

        int result = 0;
        s = s.concat(" ");

        for (int i = 0; i < s.length() - 1; i++) {
            String check = s.substring(i, i + 2);

            if (hashtable.containsKey(check)) {
                result += hashtable.get(check);
                i++;
            } else {
                result += hashtable.get(s.substring(i, i + 1));
            }
        }
        return result;
    }

    static int romanToInt1 (String s) {
        HashMap<Character, Integer> hashtable = new HashMap<>();
        hashtable.put('I', 1);
        hashtable.put('V', 5);
        hashtable.put('X', 10);
        hashtable.put('L', 50);
        hashtable.put('C', 100);
        hashtable.put('D', 500);
        hashtable.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {

// TODO: почему не работают сроки под комментами ниже???
            if (i < (s.length() - 1) && hashtable.get(s.charAt(i)) < hashtable.get(s.charAt(i + 1))) {
//                int current = hashtable.get(s.charAt(i));
//                int next = hashtable.get(s.charAt(i + 1));
                result -= hashtable.get(s.charAt(i));
            } else {
                result += hashtable.get(s.charAt(i));
            }
        }

        return result;
    }
}

