package TopInterview;

public class Topinterview29 {
    public int divide(int dividend, int divisor) {
        if (dividend == 0) return 0;
        if (divisor == 1) return dividend;
        if (divisor == -1){
            if (dividend > Integer.MIN_VALUE)
                return -dividend;
            return Integer.MAX_VALUE;
        }
        long a = dividend, b = divisor;
        int flag = 1;
        if ((a > 0 && b < 0) || (a < 0 && b > 0))
            flag = -1;
        a = a > 0 ? a : -a;
        b = b > 0 ? b : -b;
        long res = div(a, b);
        if (flag > 0)
            return res > Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) res;
        return (int) -res;
    }

    private long div(long a, long b) {
        if (a < b)
            return 0;
        long count = 1;
        long tb = b;
        while ((tb + tb) <= a){
            count = count + count;
            tb = tb + tb;
        }
        return count + div(a - tb, b);
    }
}
