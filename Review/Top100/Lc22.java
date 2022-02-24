import java.util.ArrayList;
import java.util.List;

public class LeetCode22 {
    int n;
    List<String> res = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        this.n = n;
        dfs("", 0, 0);
        return res;
    }

    private void dfs(String s, int left, int right) {
        if (s.length() == 2 * n){
            res.add(new String(s));
            return;
        }
        if (left < n){
            dfs(s + "(", left + 1, right);
        }
        if (right < left){
            dfs(s + ")", left, right + 1);
        }
    }
}
