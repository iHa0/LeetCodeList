public class Top70 {
    public int climbStairs(int n) {
        int a = 1, b = 2;
        if (n == 1)
            return a;
        if (n == 2)
            return b;
        for (int i = 2; i < n; i++) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        return b;
    }
}
