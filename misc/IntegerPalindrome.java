class Main {
    public static boolean isPalindrome(int x) {
        if (x == 0) return true;
        if (x < 0) return false;
        if (x % 10 == 0) return false;

        int reverse = 0;
        while (x > reverse) {
            reverse = reverse * 10 + x % 10;
            x /= 10;
        }
        return x == reverse || x == reverse / 10;
    }

    public static void main(String[] args) {
        System.out.println("Is 555 an integer palindrome? " + isPalindrome(555));
        System.out.println("Is 0 an integer palindrome? " + isPalindrome(0));
        System.out.println("Is 122345 an integer palindrome? " + isPalindrome(122345));
    }
}
