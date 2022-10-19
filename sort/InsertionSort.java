import java.util.*;

class InsertionSort {
    public static int[] insertionSort(int[] arr) {

        for (int i = 1; i < arr.length ; i++) {
            int curr = arr[i];

            int j = i - 1;
            while (j >= 0 && arr[j] > curr) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = curr;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(insertionSort(new int[] {29,10,14,37,13})));
        System.out.println(Arrays.toString(insertionSort(new int[] {29,10,37,37,0})));
        System.out.println(Arrays.toString(insertionSort(new int[] {-10,-20,14,-7,13})));
        System.out.println(Arrays.toString(insertionSort(new int[] {1})));
    }
}