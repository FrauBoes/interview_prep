import java.util.*;

class HeapSort {
    public static int[] heapSort(int[] arr, boolean minHeap)  {
        PriorityQueue<Integer> heap = minHeap ? new PriorityQueue<>() : new PriorityQueue<>(Collections.reverseOrder());
        Arrays.stream(arr).forEach(e -> heap.add(e));

        var result = new int[arr.length];
        int i = 0;
        while (heap.peek() != null) {
            result[i++] = heap.poll();
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(heapSort(new int[] {29,10,14,37,13}, true)));
        System.out.println(Arrays.toString(heapSort(new int[] {29,10,14,37,13}, false)));
        System.out.println(Arrays.toString(heapSort(new int[] {-10,-20,14, 14, -7,13}, true)));
        System.out.println(Arrays.toString(heapSort(new int[] {-10,-20,14, 14, -7,13}, false)));
        System.out.println(Arrays.toString(heapSort(new int[] {1}, true)));
    }
}