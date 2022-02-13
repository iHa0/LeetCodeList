package Review;

import java.util.*;

public class LeetCode51 {
    HashSet<Integer> l = new HashSet<>();
    HashSet<Integer> left = new HashSet<>();
    HashSet<Integer> right = new HashSet<>();
    int n;
    List<List<String>> res = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        this.n = n;
        Deque<Integer> path = new ArrayDeque<>();
        back(0, path);
        return res;
    }

    private void back(int h, Deque<Integer> path) {
        if (h == n){
            List<String> list = path2board(path);
            res.add(list);
            return;
        }
        for (int j = 0; j < n; j++) {
            if (!l.contains(j) && !left.contains(j + h) && !right.contains(j - h)){
                l.add(j);
                left.add(j + h);
                right.add(j - h);
                path.add(j);
                back(h + 1, path);
                l.remove(j);
                left.remove(j + h);
                right.remove(j - h);
                path.removeLast();
            }
        }
    }

    private List<String> path2board(Deque<Integer> path) {
        List<String> temp = new ArrayList<>();
        for (Integer num : path) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < Math.max(0, n); i++) {
                sb.append(".");
            }
            sb.replace(num, num + 1, "Q");
            temp.add(sb.toString());
        }
        return temp;
    }
}
