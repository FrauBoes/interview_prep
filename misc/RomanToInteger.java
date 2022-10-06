import java.util.*;

class Main {

    public static final Map<Character, Integer> map = new HashMap<>(Map.of('I', 1, 'V', 5,'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000));

    public static int romanToInt(String s) {
        int sum = 0;
        int previous = 1;

        // iterate from back to front for easy addition and subtraction
        for (int i = s.length() - 1; i >= 0; i--) {
            int current = map.get(s.charAt(i));
            if (current < previous) {
                sum -= current;
            } else {
                sum += current;
            }
            previous = current;
        }

        return sum;
    }

    public static void main(String[] args) {
        String r1 = "III";
        System.out.println("Integer: " + romanToInt(r1));

        String r2 = "I";
        System.out.println("Integer: " + romanToInt(r2));

        String r3 = "ICI";
        System.out.println("Integer: " + romanToInt(r3));
    }
}