import java.util.*;

class DecodeString {
    public static String decodeString(String s) {
        var stack = new ArrayDeque<Character>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!isClosingBracket(c)) stack.push(c);
            else decode(stack);
        }

        var result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.reverse().toString();
    }

    public static void decode(Deque<Character> stack) {
        var str = new StringBuilder();
        var count = new StringBuilder();

        while (stack.peek() != null && !isOpenBracket(stack.peek())) {
            char c = stack.pop();
            if (isLetter(c)) str.append(c);
        }

        stack.pop();  // pop open bracket

        while (stack.peek() != null && isDigit(stack.peek())) {
            char c = stack.pop();
            if (isDigit(c)) count.append(c);
        }

        int c = Integer.valueOf(count.reverse().toString());
        for (int i = 0; i < c; i++) {
            for (int j = str.length() - 1; j >= 0; j--) {
                stack.push(str.charAt(j));
            }
        }
    }

    public static boolean isDigit(char c) {
        return c >= 48 && c <= 57;
    }

    public static boolean isLetter(char c) {
        return c >= 97 && c <= 122;
    }

    public static boolean isOpenBracket(char c) {
        return c == '[';
    }

    public static boolean isClosingBracket(char c) {
        return c == ']';
    }

    public static void main(String[] args) {
        System.out.println("decoded string: " + decodeString("3[a2[c]]"));
        System.out.println("decoded string: " + decodeString("2[abc]3[cd]ef"));
    }
}