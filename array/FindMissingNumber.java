class FindMissingNumber {
    public static int missingNumber(int[] nums) {
        int l = nums.length;
        int expectedSum = l * (l + 1) / 2;  // gauss' formula

        int sum = 0;
        for (int n : nums) {
            sum += n;
        }

        return expectedSum - sum;
    }

    public static void main(String[] args) {
        System.out.println("Missing number: " + missingNumber(new int[]{5, 0, 4, 3, 2, 1}));
        System.out.println("Missing number: " + missingNumber(new int[]{1}));
    }
}