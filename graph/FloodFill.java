import java.util.*;

class FloodFill {
    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int oldColor = image[sr][sc];
        if (oldColor != newColor) dfs(image, sr, sc, oldColor, newColor);

        return image;
    }

    private static void dfs(int[][] image, int row, int col, int oldColor, int newColor) {
        if (image[row][col] == oldColor) {
            image[row][col] = newColor;

            if (row - 1 >= 0) dfs(image, row - 1, col, oldColor, newColor);
            if (col - 1 >= 0) dfs(image, row, col - 1, oldColor, newColor);
            if (row + 1 < image.length) dfs(image, row + 1, col, oldColor, newColor);
            if (col + 1 < image.length) dfs(image, row, col + 1, oldColor, newColor);
        }
    }

    public static void main(String[] args) {
        Arrays.stream(floodFill(new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 0, 1}}, 1, 1, 2))
                .forEach(a -> {System.out.println(Arrays.toString(a));});
        Arrays.stream(floodFill(new int[][]{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}}, 1, 1, 0))
                .forEach(a -> {System.out.println(Arrays.toString(a));});
    }
}