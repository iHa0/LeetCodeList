package TopInterview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class TopInterview36 {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer, Set<Integer>> h = new HashMap<>();
        HashMap<Integer, Set<Integer>> l = new HashMap<>();
        HashMap<Integer, Set<Integer>> k = new HashMap<>();
        int len = board.length;
        for (int i = 0; i < len; i++) {
            h.put(i, new HashSet<>());
            l.put(i, new HashSet<>());
            k.put(i, new HashSet<>());
        }
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                char ch = board[i][j];
                if (ch == '.')
                    continue;
                int temp = ch - '0';
                int idx = i / 3 * 3 + j / 3;
                if (h.get(i).contains(temp) || l.get(j).contains(temp) || k.get(idx).contains(temp))
                    return false;
                h.get(i).add(temp);
                l.get(j).add(temp);
                k.get(idx).add(temp);
            }
        }
        return true;
    }
}
