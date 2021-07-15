import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LeetCode139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        int temp = 0;
        Set<String> wordSet = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {

                String subS = s.substring(j , i);
                if (dp[j] && wordSet.contains(subS)){
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[s.length()];
    }
}
