class Solution {
    boolean[] onPath;
    boolean[] visited;
    boolean hasCycle = false;
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        this.onPath = new boolean[numCourses];
        this.visited = new boolean[numCourses];
        ArrayList<Integer>[] graph = new ArrayList[numCourses];
        graph = buildGraph(numCourses, prerequisites);
        for (int i = 0; i < numCourses; i++) {
            dfs(graph, i);
        }
        return !hasCycle;
    }

    private ArrayList<Integer>[] buildGraph(int numCourses, int[][] prerequisites) {
        ArrayList<Integer>[] graph = new ArrayList[numCourses];
        for (int i = 0; i < numCourses; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int[] cp : prerequisites) {
            int to = cp[0];
            int from = cp[1];
            graph[from].add(to);
        }
        return graph;
    }

    private void dfs(ArrayList<Integer>[] graph, int index) {
        if (onPath[index]) hasCycle = true;
        if (visited[index] || hasCycle) return;
        visited[index] = true;
        onPath[index] = true;
        for (int t : graph[index]) dfs(graph, t);
        onPath[index] = false;
    }
}
