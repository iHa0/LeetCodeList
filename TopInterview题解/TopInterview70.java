package TopInterview;

public class TopInterview70 {
    public int climbStairs(int n) {
        int a = 1, b = 2;
        if (n == 1)
            return a;
        if (n == 2)
            return b;
        int res = 0;
        for (int i = 2; i < n; i++) {
            res = a + b;
            a = b;
            b = res;
        }
        return res;
    }
}
