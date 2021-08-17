public class CodingInterviews14_2 {
    public int cuttingRope(int n) {
        if(n == 2) return 1;
        if(n == 3) return 2;
        long result = 1;
        while(n > 4){
            n -= 3;
            result *= 3;
            result %= 1000000007;
        }
        return (int)(n * result % 1000000007);
    }
}
