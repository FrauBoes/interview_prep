import java.util.*;

class Intersection {
    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums1) {
            map.merge(n, 1, Integer::sum);
        }

        // reuse nums1 as result store
        int i = 0;

        for (int n : nums2) {
            if (map.containsKey(n)) {
                if (map.get(n) != 0) {
                    nums1[i++] = n;
                    map.replace(n, map.get(n)-1);
                } else {
                    map.remove(n);
                }
            }
        }

        return Arrays.copyOfRange(nums1, 0, i);
    }

    public static void main(String[] args) {
        System.out.println(intersect(new int[]{1, 2, 3, 4, 5, 6}, new int[]{2, 6}));
    }

}