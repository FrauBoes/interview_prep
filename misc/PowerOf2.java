class PowerOf2 {
    public static boolean isPowerOf2(int n) {
        if (n == 0) return false;

        long x = (long) n;

        return (x & (x-1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOf2(8));
        System.out.println(isPowerOf2(64));
        System.out.println(isPowerOf2(0));
        System.out.println(isPowerOf2(-2147483648));
    }
}