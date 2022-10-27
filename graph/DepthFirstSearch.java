import java.util.*;

class DepthFirstSearch {
    public static boolean validPath(int n, int[][] edges, int source, int destination) {
        // make adjecency list
        var graph = new HashMap<Integer, List<Integer>>();
        for (int[] edge : edges) {
            int n1 = edge[0];
            int n2 = edge[1];
            graph.computeIfAbsent(n1, val -> new ArrayList<Integer>()).add(n2);
            graph.computeIfAbsent(n2, val -> new ArrayList<Integer>()).add(n1);
        }

        var visited = new boolean[n];

        dfs(graph, visited, source, destination);
    }

    public static boolean dfs(HashMap<Integer, List<Integer>> graph, int[] visited, int curr, int destination) {
        if (source == destination) return true;

        if (!visited[curr]) {
            visited[curr] = true;
            for (int node : graph.get(curr)) {
                if (dfs(graph, visited, node, destination)) return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println("Path exists? " + validPath(3, new int[][]{{0,1},{1,2},{2,0}}, 0, 2));
    }
}