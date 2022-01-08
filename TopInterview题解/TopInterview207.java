package TopInterview;

import java.util.ArrayList;

public class TopInterview207 {
    boolean[] visited;
    boolean[] onPath;
    boolean hasCycle = false;
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        this.visited = new boolean[numCourses];
        this.onPath = new boolean[numCourses];
        ArrayList<Integer>[] graph = new ArrayList[numCourses];
        graph = builgGraph(numCourses, prerequisites);
        for (int i = 0; i < numCourses; i++) {
            dfs(graph, i);
        }
        return !hasCycle;
    }

    public ArrayList<Integer>[] builgGraph(int numCourses, int[][] prerequisites){
        ArrayList<Integer>[] graph = new ArrayList[numCourses];
        for (int i = 0; i < numCourses; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int[] t : prerequisites) {
            int from = t[0];
            int to = t[1];
            graph[from].add(to);
        }
        return graph;
    }

    public void dfs(ArrayList<Integer>[] graph, int index){
        if (onPath[index])
            hasCycle = true;
        if (visited[index] || hasCycle)
            return;
        visited[index] = true;
        onPath[index] = true;
        for (int t: graph[index]) {
            dfs(graph, t);
        }
        onPath[index] = false;
    }
}
