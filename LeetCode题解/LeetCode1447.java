import java.util.LinkedList;
import java.util.List;

public class LeetCode1447 {
    public List<String> simplifiedFractions(int n) {
        List<String> res = new LinkedList<>();
        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if (gcd(i, j) == 1){
                    res.add(i + "/" + j);
                }
            }
        }
        return res;
    }

    public int gcd(int a, int b){
        return b == 0 ? a : gcd(b, a % b);
    }
}
