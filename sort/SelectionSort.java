import java.util.*;

class SelectionSort {
    public static int[] selectionSort(int[] arr) {

        for (int i = 0; i < arr.length ; i++) {
            int indexMin = i;

            for (int j = i+1; j < arr.length ; j++) {
                if (arr[j] < arr[indexMin]) indexMin = j;
            }

            int temp = arr[i];
            arr[i] = arr[indexMin];
            arr[indexMin] = temp;
        }

        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(selectionSort(new int[] {29,10,14,37,13})));
        System.out.println(Arrays.toString(selectionSort(new int[] {29,10,37,37,0})));
        System.out.println(Arrays.toString(selectionSort(new int[] {-10,-20,14,-7,13})));
        System.out.println(Arrays.toString(selectionSort(new int[] {1})));
    }
}