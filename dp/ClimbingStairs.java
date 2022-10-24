class ClimbingStairs {
    public static int climbStairs(int n) {
        if (n == 1) return 1;

        var stairs = new int[n];
        stairs[0] = 1;
        stairs[1] = 2;

        for (int i = 2; i < n; i++) {
            stairs[i] = stairs[i-2] + stairs[i-1];
        }

        return stairs[n-1];
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(2));
        System.out.println(climbStairs(1));
        System.out.println(climbStairs(5));
    }
}