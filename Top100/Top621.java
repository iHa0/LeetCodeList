package Top100;

import java.util.Arrays;

public class Top621 {
    public int leastInterval(char[] tasks, int n){
        int[] score = new int[26];
        for (char a:
             tasks) {
            score[a - 'A']++;
        }
        Arrays.sort(score);
        int maxIndex = score[25], indexCount = 1;
        for (int i = 25; i >= 1; i--) {
            if (score[i] == score[i - 1])
                indexCount++;
            else
                break;
        }
        int res = (maxIndex - 1) * (n + 1) + indexCount;
        return Math.max(res, tasks.length);
    }
}
