public class LeetCode1137 {
    public int tribonacci(int n) {
        int a = 0, b = 1, c = 1, m, l;
        if (n <= 1)
            return n;
        if (n == 2)
            return 1;
        for (int i = 2; i < n; i++) {
            if (a >= b){
                m = c;
                c = b;
                b = m;
            }else {
                m = c;
                c = a;
                a = m;
            }
            c = a + b + c;
        }
        return c;
    }
}
