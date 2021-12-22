package TopInterview;

public class TopInterview50 {
    public double myPow(double x, int n) {
        if (x == 0)
            return 0.0;
        if (n == 0 || x == 1)
            return 1.0;
        if (x == -1 && n < 0)
            return 1;
        if (x == -1 && n > 0)
            return -1;
        long time = n;
        if (n < 0){
            x = 1 / x;
            time = -time;
        }
        double res = x;
        for (int i = 1; i < time; i++) {
            if (res < 1e-6 && res > 0)
                return 0.000000;
            res *= x;
        }
        return res;
    }
}
