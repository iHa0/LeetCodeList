import java.util.ArrayList;
import java.util.List;

public class LeetCode2100 {
    List<Integer> res = new ArrayList<>();
    int len;
    public List<Integer> goodDaysToRobBank(int[] security, int time) {
        this.len = security.length;
        if (len < time * 2 + 1)
            return res;
        int[] dp1 = new int[len];
        int[] dp2 = new int[len];
        dp1[0] = 1;
        dp2[len - 1] = 1;
        for (int i = 1; i < len; i++) {
            if (security[i] <= security[i - 1])
                dp1[i] = dp1[i - 1] + 1;
            else
                dp1[i] = 1;
        }
        for (int i = len - 2; i >=  0; i--) {
            if (security[i] <= security[i + 1])
                dp2[i] = dp2[i + 1] + 1;
            else
                dp2[i] = 1;
        }
        for (int i = 0; i < len; i++) {
            if (dp1[i] >= time + 1 && dp2[i] >= time + 1)
                res.add(i);
        }
        return res;
    }
}
