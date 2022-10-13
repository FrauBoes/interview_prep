import java.io.*;
import java.util.*;


class Main {

    boolean areTheyEqual(int[] a, int[] b) {
        // Write your code here



        // 1, 4, 2, 3 >> 1, 3, 2, 4 >> 1, 2, 3, 4 ?

        // steps
        // 1. sort A and B, then compare. If equal return true, else false

        // time: O(n log n)
        // space: O(1)

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);

    }

    // Tests
    int test_case_number = 1;
    void check(boolean expected, boolean output) {
        boolean result = (expected == output);
        char rightTick = '\u2713';
        char wrongTick = '\u2717';
        if (result) {
            System.out.println(rightTick + " Test #" + test_case_number);
        }
        else {
            System.out.print(wrongTick + " Test #" + test_case_number + ": Expected ");
            System.out.print(expected);
            System.out.print(" Your output: ");
            System.out.print(output);
            System.out.println();
        }
        test_case_number++;
    }

    public void run() {
        int[] array_a_1 = {1, 2, 3, 4};
        int[] array_b_1 = {1, 4, 3, 2};
        boolean expected_1 = true;
        boolean output_1 = areTheyEqual(array_a_1, array_b_1);
        check(expected_1, output_1);

        int[] array_a_2 = {1, 2, 3, 4};
        int[] array_b_2 = {1, 4, 3, 3};
        boolean expected_2 = false;
        boolean output_2 = areTheyEqual(array_a_2, array_b_2);
        check(expected_2, output_2);
        // Add your own test cases here

    }

    public static void main(String[] args) {
        new Main().run();
    }
}