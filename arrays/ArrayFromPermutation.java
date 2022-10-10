import java.util.*;

class Main {

    public static int[] permute(int[] nums) {

        int n = nums.length;

        for (int i = 0; i < n; i++) {

            // store 2 values at 1 index, using Euclid's Division Algorithm (a = bq + r);
            // can later retrieve values with either % or / calculation
            nums[i] = n * (nums[nums[i]] % n) + nums[i];
        }

        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] / n;
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 6, 5, 3, 4, 0};
        System.out.println("Permutation of " + Arrays.toString(arr) + " is: " + Arrays.toString(permute(arr)));
    }
}