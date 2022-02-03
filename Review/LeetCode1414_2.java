package Review;

public class LeetCode1414 {
    public int findMinFibonacciNumbers(int k) {
        int a = 1, b = 1;
        while (b <= k){
            int c = a + b;
            a = b;
            b = c;
        }
        int res = 0;
        while (k != 0){
            if (k >= b){
                k -= b;
                res++;
            }
            int  c = b - a;
            b = a;
            a = c;
        }
        return res;
    }
}
