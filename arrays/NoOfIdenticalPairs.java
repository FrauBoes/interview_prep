import java.util.*;

class Main {
    public static int numIdenticalPairs(int[] nums) {

        short[] count = new short[101];

        for (int n : nums) {
            count[n]++;
        }

        int noOfPairs = 0;

        for (short c : count) {
            noOfPairs += c * (c-1) / 2;
        }

        return noOfPairs;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 1, 1, 3 };
        System.out.println("Number of identical pairs in " + Arrays.toString(arr) + " is: " + numIdenticalPairs(arr));
    }
}