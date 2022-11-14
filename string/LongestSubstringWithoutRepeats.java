import java.util.*;

class LongestSubstringWithoutRepeats {
    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> chars = new HashMap<>();
        int left = 0;
        int right = 0;
        int max = 0;

        while (right < s.length()) {
            char r = s.charAt(right);
            chars.merge(r, 1, Integer::sum);

            while (chars.get(r) > 1) {
                char l = s.charAt(left);
                chars.put(l, chars.get(l) - 1);
                left++;
            }

            max = Math.max(max, right - left + 1);
            right++;
        }

        return max;
    }


    public static void main(String[] args) {
        System.out.println("Expected: 3 - " + lengthOfLongestSubstring("abcabcbb"));
        System.out.println("Expected: 0 - " + lengthOfLongestSubstring(""));
        System.out.println("Expected: 1 - " + lengthOfLongestSubstring("bbbbb"));
        System.out.println("Expected: 3 - " + lengthOfLongestSubstring("pwwkew"));
        System.out.println("Expected: 12 - " + lengthOfLongestSubstring("abc345&*(XYZ"));
    }
}