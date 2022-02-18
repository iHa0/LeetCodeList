public class LeetCode1791_2 {
    public int findCenter(int[][] edges) {
        int a = edges[0][0], b = edges[0][1];
        if (a == edges[1][0] || b == edges[1][1])
            return a;
        else
            return b;
    }
}
