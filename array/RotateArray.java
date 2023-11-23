import java.util.Arrays;
import java.util.Collections;

class Scratch {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4}, 1)));
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4}, 4)));
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4}, 5)));
        System.out.println(Arrays.toString(solution(new int[]{0}, 0)));
    }

    public static int[] solution(int[] arr, int k) {
        if (k == 0 || k % arr.length == 0) {
            return arr;
        }

        Integer[] array = Arrays.stream(arr).boxed().toArray(Integer[]::new);

        Collections.rotate(Arrays.asList(array), k);

        return Arrays.stream(array).mapToInt(Integer::intValue).toArray();
    }
}
