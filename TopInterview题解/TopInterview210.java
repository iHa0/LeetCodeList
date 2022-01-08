package TopInterview;

import java.util.ArrayList;
import java.util.Stack;

public class TopInterview210 {
    boolean[] visited;
    boolean[] onPath;
    boolean hasCycle = false;
    int[] res;
    Stack<Integer> stack = new Stack<>();
    int num;
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        this.visited = new boolean[numCourses];
        this.onPath = new boolean[numCourses];
        this.res = new int[numCourses];
        this.num = numCourses;
        ArrayList<Integer>[] graph = new ArrayList[numCourses];
        graph = buildGraph(numCourses, prerequisites);
        for (int i = 0; i < numCourses; i++) {
            dfs(graph, i);
        }
        if (hasCycle)
            return new int[0];
        int count = 0;
        while (!stack.isEmpty()){
            res[count++] = stack.pop();
        }
        return res;
    }

    public ArrayList<Integer>[] buildGraph(int numCourses, int[][] prerequisites){
        ArrayList<Integer>[] graph = new ArrayList[numCourses];
        for (int i = 0; i < numCourses; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int[] t :
                prerequisites) {
            int to = t[0];
            int from = t[1];
            graph[from].add(to);
        }
        return graph;
    }

    public void dfs(ArrayList<Integer>[] graph, int index){
        if (onPath[index])
            hasCycle = true;
        if (visited[index] || hasCycle){
            return;
        }
        visited[index] = true;
        onPath[index] = true;
        for (int t : graph[index]) {
            dfs(graph, t);
        }
        stack.add(index);
        onPath[index] = false;
    }
}
