package Top100;

import java.util.*;

public class LeetCode51 {
    List<List<String>> res = new ArrayList<>();
    int n;
    HashSet<Integer> l = new HashSet<>();
    HashSet<Integer> left = new HashSet<>();
    HashSet<Integer> right = new HashSet<>();
    public List<List<String>> solveNQueens(int n) {
        this.n = n;
        Deque<Integer> path = new ArrayDeque<>();
        back(0, path);
        return res;
    }

    private void back(int i, Deque<Integer> path) {
        if (i == n){
            List<String> temp = pathToList(path);
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

    private List<String> pathToList(Deque<Integer> path) {
        List<String> stringList = new ArrayList<>();
        for (int a : path) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                sb.append(".");
            }
            sb.replace(a, a + 1, "Q");
            stringList.add(sb.toString());
        }
        return stringList;
    }
}
