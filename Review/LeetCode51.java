import java.util.*;

public class Lc51 {
    HashSet<Integer> l = new HashSet<>();
    HashSet<Integer> left = new HashSet<>();
    HashSet<Integer> right = new HashSet<>();
    List<List<String>> res = new ArrayList<>();
    int n;
    public List<List<String>> solveNQueens(int n) {
        this.n = n;
        Deque<Integer> path = new ArrayDeque<>();
        back(0, path);
        return res;
    }

    private void back(int i, Deque<Integer> path) {
        if (i == n){
            List<String> temp = path2string(path);
            res.add(temp);
            return;
        }
        for (int j = 0; j < n; j++) {
            if (!l.contains(j) && !left.contains(i + j) && !right.contains(i - j)){
                l.add(j);
                left.add(i + j);
                right.add(i - j);
                path.add(j);
                back(i + 1, path);
                l.remove(j);
                left.remove(i + j);
                right.remove(i - j);
                path.removeLast();
            }
        }
    }

    private List<String> path2string(Deque<Integer> path) {
        List<String> lists = new ArrayList<>();
        for (Integer num : path) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                sb.append(".");
            }
            sb.replace(num, num + 1, "Q");
            lists.add(sb.toString());
        }
        return lists;
    }
}
