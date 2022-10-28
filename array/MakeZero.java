import java.util.*;

class MakeZero {
    public static int minimumOperations(int[] nums) {
        return (int) Arrays.stream(nums).distinct().filter(n -> n != 0).count();
    }

    public static void main(String[] args) {
        System.out.println("Min ops to make all elements zero: " + minimumOperations(new int[]{1, 5, 3, 0, 3}));
    }
}