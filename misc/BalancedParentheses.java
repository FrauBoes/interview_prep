boolean solution(String text) {
        // assume only alpha-numeric ASCII as input
        // check for balanced parentheses by using 1 stack

        // for each char c
        // if not (), ignore
        // else use stack to keep track of opening and closing parentheses

        ArrayDeque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (isOpen(c)) {
                stack.push(c);
            }
            if (isClose(c)) {
                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();

}

static final char openPara = '(';
static final char closePara = ')';

static boolean isOpen(char c) { return c == openPara; }
static boolean isClose(char c) { return c == closePara; }