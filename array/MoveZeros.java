import java.util.*;

class MoveZeros {
    public static void moveZeros(int[] nums) {
        int zeroCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroCount++;
            } else if (zeroCount > 0) {
                nums[i - zeroCount] = nums[i];
                nums[i] = 0;
            }
        }
    }

    public static void main(String[] args) {
        var in1 = new int[]{0, 1, 0, 3, 12};
        moveZeros(in1);
        System.out.println(Arrays.toString(in1));

        var in2 = new int[]{0, 0, 0, 0, 0, 1};
        moveZeros(in2);
        System.out.println(Arrays.toString(in2));
    }
}