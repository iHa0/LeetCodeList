import java.util.ArrayList;
import java.util.List;

public class Top22 {
    List<String> res = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        dfs("", 0, 0, n);
        return res;
    }

    public void dfs(String ss, int left, int right, int n){
        if (ss.length() == n * 2){
            res.add(ss);
            return;
        }
        if (left < n){
            dfs(ss + "(", left + 1, right, n);
        }
        if (right < left){
            dfs(ss + ")", left, right + 1, n);
        }
    }
}
