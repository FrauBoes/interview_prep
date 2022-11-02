import java.util.*;

class ArrayJumps {

    public static int jump(int[] arr, int s, int x) {

        int left = 0;
        int right = arr.length - 1;
        int currIndex = s;
        int target = arr[currIndex] + 1;
        boolean foundLastTarget = false;

        // loop for alternating jumps
        for (int i = 1; i <= arr.length; i++) {

            if (i % 2 == 0) {  // jump to right
                left = currIndex + 1;
                right = arr.length - 1;
                while (left <= right) {
                    if (arr[left] == target) {
                        foundLastTarget = true;
                        arr[currIndex] += x;
                        currIndex = left;
                        target++;
                        break;
                    }
                    left++;
                }
                if (!foundLastTarget) {
                    return currIndex;
                }

            } else {  // jump to left
                left = 0;
                right = currIndex - 1;
                while (right >= left) {
                    if (arr[right] == target) {
                        foundLastTarget = true;
                        arr[currIndex] += x;
                        currIndex = right;
                        target++;
                        break;
                    }
                    right--;
                }
                if (!foundLastTarget) {
                     return currIndex;
                }
            }

            foundLastTarget = false;
        }

        return currIndex;
    }

    public static void main(String[] args) {
        System.out.println("Final index: " + jump(new int[] {2, 3, 1, 2, 4}, 2, 3));
        System.out.println("Final index: " + jump(new int[] {1}, 0, 3));
        System.out.println("Final index: " + jump(new int[] {2, 1}, 1, 2));
    }
}