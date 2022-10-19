import java.util.*;

class CountingSort {
    public static int[] countingSort(int[] arr) {
        int[] counts = new int[10];  // counter for range [1-9]
                                     // use 10 to adapt to 0-based indexing
        for (int n : arr) {
            counts[n]++;
        }

        for (int i = 1, j = 0; i < counts.length; i++) {
            while (counts[i]-- != 0) {
                arr[j++] = i;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countingSort(new int[] {4,6,8,2,1,4,3,5,6,6,5,6,9,8,9,2,1,2,3})));
    }
}