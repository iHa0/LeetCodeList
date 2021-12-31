package TopInterview;

// 不推荐使用这种方法，参考第一种方法（TopInterview127.java）
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TopInterview127_2 {
    String beginWord;
    String endWord;
    int[][] dp;
    int h;
    int len;
    int res = Integer.MAX_VALUE;
    boolean[] flag;
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (!wordList.contains(endWord))
            return 0;
        int len1 = beginWord.length();
        int len2 = endWord.length();
        if (len1 != len2)
            return 0;
        this.len = len1;
        List<String> lists = new ArrayList<>();
        lists.add(beginWord);
        for (String temp : wordList) {
            if (temp.equals(endWord))
                continue;
            if (temp.equals(beginWord))
                continue;
            lists.add(temp);
        }
        lists.add(endWord);
        this.h = lists.size();
        this.beginWord = beginWord;
        this.endWord = endWord;
        dp = new int[h][h];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < h; j++) {
                dp[i][j] = isMatch(i, j, lists);
            }
        }
        res = bfs();
        return res ;
    }
    public int isMatch(int i, int j, List<String> list){
        String a = list.get(i);
        String b = list.get(j);
        int count = 0;
        for (int k = 0; k < len; k++) {
            if (a.charAt(k) != b.charAt(k))
                count++;
            if (count > 1)
                return 0;
        }
        if (count == 1)
            return 1;
        return 0;
    }
    public int bfs(){
        int count = 0;
        flag = new boolean[h];
        Queue<Integer> queue = new LinkedList<>();
        flag[0] = true;
        queue.add(0);
        while (!queue.isEmpty()){
            int temp = queue.size();
            for (int i = 0; i < temp; i++) {
                int k = queue.poll();
                if (k == h - 1)
                    return count + 1;
                for (int j = 0; j < h; j++) {
                    if (dp[k][j] == 1 && flag[j] == false){
                        flag[j] = true;
                        queue.add(j);
                    }
                }
            }
            count++;
        }
        return 0;
    }
}
