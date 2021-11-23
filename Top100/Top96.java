public class Top96 {
    public int numTrees(int n) {
        long res = 1;
        for (int i = 1; i < n; i++) {
            res = res * 2 * ( 2 * i  + 1) / (i + 2);
        }
        return (int)res;
    }
}
