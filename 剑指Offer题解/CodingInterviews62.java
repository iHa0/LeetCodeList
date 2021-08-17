public class CodingInterviews62 {
    public int lastRemaining(int n, int m) {
        int p = 0;
        for (int i = 2; i <= n; i++) {
            p = (p + m) % i;
        }
        return p;
    }
}
