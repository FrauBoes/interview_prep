import java.util.*;

class BalancedParentheses {
    // time:  O(n), n = length of string
    // space: O(n)

    static boolean isBalanced(String text) {
        var stack = new ArrayDeque<Character>();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (c == '(') {
                stack.push(c);
            }
            if (c == ')') {
                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isBalanced("(())"));
        System.out.println(isBalanced("(Hello world!) ()"));
        System.out.println(isBalanced(""));
        System.out.println(isBalanced("("));
        System.out.println(isBalanced(")"));
        System.out.println(isBalanced("((Hello world!)"));
        System.out.println(isBalanced("())(()"));
    }
}