package TopInterview;

import java.util.ArrayList;
import java.util.List;

public class TopInterview212 {
    char[][] board;
    String[] words;
    int h, l;
    boolean[][] visited;
    List<String> res = new ArrayList<>();
    public List<String> findWords(char[][] board, String[] words) {
        this.board = board;
        this.words = words;
        this.h = board.length;
        this.l = board[0].length;
        this.visited = new boolean[h][l];
        boolean flag;
        for (String s : words) {
            flag = false;
            for (int i = 0; i < h; i++) {
                if (flag)
                    continue;
                for (int j = 0; j < l; j++) {
                    if (flag)
                        continue;
                    flag = search(s, i, j, 0);
                    if (flag)
                        res.add(s);
                }
            }
        }
        return res;
    }

    public boolean search(String s, int i, int j, int index){
        if (s.length() == index)
            return true;
        if (i < 0 || j < 0 || i >= h || j >= l || visited[i][j] || s.charAt(index) != board[i][j]){
            return false;
        }
        visited[i][j] = true;
        boolean res = search(s, i - 1, j, index + 1) || search(s, i + 1, j, index + 1) ||
                search(s, i, j - 1, index + 1) || search(s, i, j + 1, index + 1);
        visited[i][j] = false;
        return res;
    }
}
