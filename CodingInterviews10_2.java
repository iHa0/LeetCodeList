public class CodingInterviews10_2 {
  
    public int numWays(int n) {
        if (n == 0 || n == 1)
            return 1;
        int a = 1 , b = 1 , c = 0;
        for (int i = 1; i  < n; i++) {
            a = (a + b) % 1000000007;
            c = a;
            a = b;
            b = c;
        }
        return b;
    }
}
