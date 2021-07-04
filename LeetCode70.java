public class LeetCode70 {
  
    public int climbStairs(int n) {
        int i = 1, j = 2, m;
        if (n <= 2)
            return n;
        for (int k = 2; k < n; k++) {
            m = i;
            i = j;
            j = m;
            j = i + j;
        }
        return j;
    }
}
