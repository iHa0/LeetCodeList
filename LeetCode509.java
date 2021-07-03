public class LeetCode509 {
    public int fib(int n) {
        int i = 1, j = 1, m;
        if (n <= 1)
            return n;
        if ( n == 2)
            return 1;
        for (int k = 2; k < n; k++) {
            j = i + j;
            m = j;
            j = i;
            i = m;
        }
        return i;
    }
}
