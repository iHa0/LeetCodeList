package TopInterview;

import java.util.LinkedList;
import java.util.List;

public class TopInterview140 {
    int len;
    List<String> res;
    List<String> wordDict;
    boolean[] dp;
    String s;
    public List<String> wordBreak(String s, List<String> wordDict) {
        this.len = s.length();
        this.res = new LinkedList<>();
        this.wordDict = wordDict;
        this.s = s;
        this.dp = new boolean[len + 1];
        dp[0] = true;
        LinkedList<String> list = new LinkedList<>();
        back(0, list);
        return res;
    }
    public void back(int index, LinkedList<String> list){
        if (dp[len] == true){
            String resList = "";
            for (String temp : list) {
                resList += temp + " ";
            }
            res.add(resList.trim());
            return;
        }
        for (int i = index + 1; i <= len; i++) {
            for (int j = index; j < i; j++) {
                if (dp[j] == true && wordDict.contains(s.substring(j, i))){
                    dp[i] = true;
                    list.add(s.substring(j, i));
                    back(i, list);
                    list.removeLast();
                    dp[i] = false;
                }
            }
        }
    }
}
