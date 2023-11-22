class Main {

    public static int binaryGap(int n) {
        // fail fast if zero or power of 2
        if (n == 0 || (n & -n) == n) {
            return 0;
        }

        double maxCount = 0;
        double curCount = 0;
        String binary = Integer.toBinaryString(n);

        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                maxCount = Math.max(maxCount, curCount);
                curCount = 0;
            } else {
                curCount++;
            }
        }

        return (int)maxCount;
    }

    public static void main(String[] args) {
      System.out.println(binaryGap(0));
      System.out.println(binaryGap(1));
      System.out.println(binaryGap(3));
      System.out.println(binaryGap(9));
  }
}
