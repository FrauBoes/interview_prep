import java.util.*;

class RevertString {
    public static char[] revert(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }

        return s;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(revert(new char[]{'h', 'e', 'l', 'l', 'o'})));
        System.out.println(Arrays.toString(revert(new char[]{'H', 'a', 'n', 'n', 'a', 'h'})));
        System.out.println(Arrays.toString(revert(new char[]{'h'})));
    }
}