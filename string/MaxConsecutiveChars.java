import java.util.*;

class MaxConsecutiveChars {
    public static String maxConsecutiveChars(String input, int maxConsecChars) {
        StringBuilder result = new StringBuilder();
        if (input.length() == 0) return input;
        if (maxConsecChars == 0) return "";

        char prev = input.charAt(0);
        int count = 1;
        result.append(prev);
        for (int i = 1; i < input.length(); i++) {
            char curr = input.charAt(i);
            if (curr == prev) {
                count++;
                if (count <= maxConsecChars) {
                    result.append(prev);
                }
            } else {
                count = 1;
                prev = input.charAt(i);
                result.append(prev);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(maxConsecutiveChars("AaaaBb", 2));
        System.out.println(maxConsecutiveChars("aaabbbcc", 2));
        System.out.println(maxConsecutiveChars("aaa", 2));
        System.out.println(maxConsecutiveChars("a", 2));
        System.out.println(maxConsecutiveChars("abcd", 0));
        System.out.println(maxConsecutiveChars("aaabbbbbcddddA", 1));
        System.out.println(maxConsecutiveChars("", 1));
    }
}
