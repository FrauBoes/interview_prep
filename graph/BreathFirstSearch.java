import java.util.*;

class BreathFirstSearch {
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
        var queue = new LinkedList<Integer>();
        queue.add(source);

        while (!queue.isEmpty()) {
            int curr = queue.remove();
            if (curr == destination) return true;

            for (int node : graph.get(curr)) {
                if (!visited[node]) {
                    visited[node] = true;
                    queue.add(node);
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println("Path exists? " + validPath(3, new int[][]{{0,1},{1,2},{2,0}}, 0, 2));
    }
}