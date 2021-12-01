package Top100;

import java.util.EnumSet;
import java.util.LinkedList;
import java.util.List;

public class Top207_2 {
    boolean[] onPath;
    boolean[] visited;
    boolean hasCycle = false;
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        onPath = new boolean[numCourses];
        visited = new boolean[numCourses];
        List<Integer>[] graph = new List[numCourses];
        graph = buildGraph(numCourses, prerequisites);
        for (int i = 0; i < numCourses; i++) {
            dfs(graph, i);
        }
        return !hasCycle;
    }
    public List<Integer>[] buildGraph(int numCourses, int[][] prerequisites){
        List<Integer>[] graph = new List[numCourses];
        for (int i = 0; i < numCourses; i++) {
            graph[i] = new LinkedList<>();
        }
        for (int[] t :
                prerequisites) {
            int from = t[0];
            int to = t[1];
            graph[from].add(to);
        }
        return graph;
    }
    public void dfs(List<Integer>[] graph, int index){
        if (onPath[index])
            hasCycle = true;
        if (visited[index] || hasCycle)
            return;
        visited[index] = true;
        onPath[index] = true;
        for (int t :
                graph[index]) {
            dfs(graph, t);
        }
        onPath[index] = false;
    }
}
