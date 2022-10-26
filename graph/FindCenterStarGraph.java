class FindCenterStarGraph {
    public static int findCenter(int[][] edges) {
        return (edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1]) ?
                edges[0][0] : edges[0][1];
    }

    public static void main(String[] args) {
        System.out.println("Center is: " + findCenter(new int[][]{{1, 2}, {2, 3}, {4, 2}}));
    }
}