import java.util.*;

class Main {

    // ASCII table, only use the 3 relevant sections
    // 48 (0) - 57 (9)
    // 65 (A) - 90 (Z)
    // 97 (a) - 122 (z)

    static char getRotatedChar(char c, int rotationFactor) {
        if (c >= 48 && c <= 57)
            return rotate(48, 10, rotationFactor, c);
        else if (c >= 65 && c <= 90)
            return rotate(65, 26, rotationFactor, c);
        else if (c >= 97 && c <= 122)
            return rotate(97, 26, rotationFactor, c);
        else return c;  // is not alpha-numeric, return itself
    }

    static char rotate(int start, int length, int factor, char c) {
        int newFactor = factor % length;
        char newC = (char) (c + newFactor);
        return newC > start + length ? (char) (newC - length) : newC;
    }

    String rotationalCipher(String input, int rotationFactor) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            result.append(getRotatedChar(input.charAt(i), rotationFactor));
        }
        return result.toString();
    }

    // Tests
    int test_case_number = 1;
    void check(String expected, String output) {
        boolean result = (expected.equals(output));
        char rightTick = '\u2713';
        char wrongTick = '\u2717';
        if (result) {
            System.out.println(rightTick + " Test #" + test_case_number);
        }
        else {
            System.out.print(wrongTick + " Test #" + test_case_number + ": Expected ");
            printString(expected);
            System.out.print(" Your output: ");
            printString(output);
            System.out.println();
        }
        test_case_number++;
    }
    void printString(String str) {
        System.out.print("[\"" + str + "\"]");
    }

    public void run() {
        String input_1 = "All-convoYs-9-be:Alert1.";
        int rotationFactor_1 = 4;
        String expected_1 = "Epp-gsrzsCw-3-fi:Epivx5.";
        String output_1 = rotationalCipher(input_1, rotationFactor_1);
        check(expected_1, output_1);

        String input_2 = "abcdZXYzxy-999.@";
        int rotationFactor_2 = 200;
        String expected_2 = "stuvRPQrpq-999.@";
        String output_2 = rotationalCipher(input_2, rotationFactor_2);
        check(expected_2, output_2);

        String input_3 = "abcdZXYzxy-999.@";
        int rotationFactor_3 = 999999;
        String expected_3 = "nopqMKLmkl-888.@";
        String output_3 = rotationalCipher(input_3, rotationFactor_3);
        check(expected_3, output_3);
    }

    public static void main(String[] args) {
        new Main().run();
    }
}