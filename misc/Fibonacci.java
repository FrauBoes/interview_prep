class Main {

    public static int fib(int n) {
        if (n <= 1) return n;

        int prev1 = 1;
        int prev2 = 0;
        int current = 0;

        for (int i = 2; i <= n; i++) {
            current = prev2 + prev1;
            prev2 = prev1;
            prev1 = current;
        }

        return current;
    }

    public static void main(String[] args) {
        System.out.println("Fib(10) = " + fib(10));
        System.out.println("Fib(0) = " + fib(0));
        System.out.println("Fib(1) = " + fib(1));
        System.out.println("Fib(30) = " + fib(30));
    }
}