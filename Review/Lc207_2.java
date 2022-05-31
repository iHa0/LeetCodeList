class Solution {
    boolean[] onPath;
    boolean[] visited;
    boolean hasCycle;
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        this.onPath = new boolean[numCourses];
        this.visited = new boolean[numCourses];
        List<Integer>[] graph = new ArrayList[numCourses];
        graph = buildGraph(numCourses, prerequisites);
        for (int i = 0; i < numCourses; i++) {
            dfs(graph, i);
        }
        return !hasCycle;
    }

    private List<Integer>[] buildGraph(int numCourses, int[][] prerequisites) {
        List<Integer>[] graph = new ArrayList[numCourses];
        for (int i = 0; i < numCourses; i++) graph[i] = new ArrayList<>();
        for (int[] cp : prerequisites) {
            int to = cp[0];
            int from = cp[1];
            graph[from].add(to);
        }
        return graph;
    }

    private void dfs(List<Integer>[] graph, int index) {
        if (onPath[index]) hasCycle = true;
        if (visited[index] || hasCycle) return;
        onPath[index] = true;
        visited[index] = true;
        for (int i : graph[index]) {
            dfs(graph, i);
        }
        onPath[index] = false;
    }
}
