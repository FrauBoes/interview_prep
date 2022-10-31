class MaximalNetworkRank {
    public static int maximalNetworkRank(int n, int[][] roads) {
        var count = new int[n];
        var connection = new int[n][n];

        for (int[] r : roads) {
            count[r[0]]++;
            count[r[1]]++;
            connection[r[0]][r[1]] = 1;
            connection[r[1]][r[0]] = 1;
        }

        int rank = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                rank = Math.max(rank, count[i] + count[j] - connection[i][j]);
            }
        }

        return rank;
    }

    public static void main(String[] args) {
        System.out.println("Max network rank is: "
                + maximalNetworkRank(4, new int[][]{{0, 1}, {0, 3}, {1, 2}, {1, 3}}));
    }
}