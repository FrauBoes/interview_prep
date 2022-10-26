class MaxSubArray {
    public static int maxSubArray(int[] nums) {
        int currentSum = 0;
        int maxSum = -100000;

        for (int n : nums) {
            currentSum += n;
            if (currentSum > maxSum) maxSum = currentSum;
            if (currentSum < 0) currentSum = 0;
        }

        return maxSum;
    }

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-1}));
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}