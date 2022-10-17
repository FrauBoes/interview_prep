public class FirstBadVersion {
    public static int firstBadVersion(int n) {
        int left = 1;
        int right = n;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid+1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        firstBadVersion(5);
    }

    public static boolean isBadVersion(int n) {
        return true;  // stub
    }
}