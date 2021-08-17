public class CodingInterviews14_1 {
    public int cuttingRope(int n) {
        if (n == 2)
            return 1;
        if (n == 3)
            return 2;
        int res = 1;
        while (n >= 3){
            res *= 3;
            n = n - 3;
        }
        if (n == 1){
            res = (res / 3) * 2 * 2;
        }
        if (n == 2){
            res = res * n;
        }
        return res;
    }
}
