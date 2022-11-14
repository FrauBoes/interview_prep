import java.util.*;

class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        LinkedList<int[]> merged = new LinkedList<>();

        for (int[] i : intervals) {
            if (merged.isEmpty() || merged.getLast()[1] < i[0]) {
                merged.add(i);
            } else {
                merged.getLast()[1] = Math.max(i[1], merged.getLast()[1]);
            }
        }

        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {
        Arrays.stream(merge(new int[][]{{1, 4},{0,4}})).forEach(a -> System.out.println(Arrays.toString(a)));
        Arrays.stream(merge(new int[][]{{1,3}})).forEach(a -> System.out.println(Arrays.toString(a)));
        Arrays.stream(merge(new int[][]{{1,3},{2,6},{8,10},{15,18}})).forEach(a -> System.out.println(Arrays.toString(a)));
    }
}