import java.util.*;

class CountingBits {
    public static int[] countBits(int n) {
        var result = new int[n+1];

        for (int i = 1; i <= n; i++) {
            // previous result without least significant bit plus one
            result[i] = result[i & (i-1)] + 1;

        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("Bit count: " + Arrays.toString(countBits(50)));
    }
}