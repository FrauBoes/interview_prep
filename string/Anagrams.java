import java.util.*;

class Anagrams {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        if (s.length() == 0) return true;

        var letters = new int[26];

        for (int i = 0; i < s.length(); i++) {
            letters[s.charAt(i) - 'a']++;
            letters[t.charAt(i) - 'a']--;
        }

        for (int l : letters) {
            if (l != 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
        System.out.println(isAnagram("", ""));
        System.out.println(isAnagram("he", "ho"));
    }
}