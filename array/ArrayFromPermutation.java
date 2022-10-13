import java.util.*;

class Main {

    public static int[] permute(int[] nums) {

        int n = nums.length;

        for (int i = 0; i < n; i++) {
            // store 2 values at 1 index, using Euclid's Division Lemma (a = bq + r);
            // conditions: b and r are not multiples of q and r < q
            // can later retrieve values with either / (b) or % (r) calculation
            // b = nums[nums[i]], q = nums.length, r = nums[i]
            nums[i] = (nums[nums[i]] % n) * n + nums[i];
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