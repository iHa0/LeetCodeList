public class CodingInterviews10 {
    public int fib(int n) {
        if (n == 0)
            return 0;
        if (n == 1 || n == 2)
            return 1;
        int a = 1 , b = 1 , c;
        for (int i = 2; i < n; i++) {
            a = (a + b) % 1000000007;
            c = b;
            b = a;
            a = c;
        }
        return b;
    }
}
