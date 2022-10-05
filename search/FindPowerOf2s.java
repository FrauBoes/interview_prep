import java.lang.*;

class Main {

    // input: large array of longs, sorted, no dupliates
    // output: count of longs that are a power of 2
    // requirement: time-performant, better than O(n)

    static int count(long[] nums, long target) {
        int count = 0;
        int left = 0;
        int right = nums.length - 1;

        // iterate over power of 2s (only 63 longs possible)
        // stop if no more power of 2 can occur in the array
        while (target <= Long.MAX_VALUE && target <= nums[right]) {
            int result = search(nums, left, right, target);
            if (result != -1) count++;
            target = target*2;
        }
        return count;
    }

    static int search(long[] nums, int left, int right, long target) {
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) return mid;
            if (nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        long[] nums = {2l, 8l, 200l, 329l, 3001223l, 302918372l, 922337203685477600l};
        System.out.println("Count power of 2 numbers: " + count(nums, 2l));
    }
}