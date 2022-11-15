import java.util.*;

class TransposeMatrix {
    public static int[][] transpose(int[][] matrix) {
        int cols = matrix[0].length;
        int rows = matrix.length;
        int[][] result = new int[cols][rows];

        for (int y = 0; y < cols; y++) {
            for (int x = 0; x < rows; x++) {
                result[y][x] = matrix[x][y];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Arrays.stream(transpose(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}})).forEach(a -> System.out.println(Arrays.toString(a)));
    }
}