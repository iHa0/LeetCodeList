package TopInterview;

import java.util.ArrayList;
import java.util.List;

public class TopInterview22 {
    List<String> res;
    public List<String> generateParenthesis(int n) {
        this.res = new ArrayList<>();
        dfs(n, 0, 0, "");
        return res;
    }
    public void dfs(int n, int left, int right, String ss){
        if (ss.length() == n * 2){
            res.add(ss);
            return;
        }
        if (left < n){
            dfs(n, left + 1, right, ss + "(");
        }
        if (right < left){
            dfs(n, left, right + 1, ss + ")");
        }
    }
}
