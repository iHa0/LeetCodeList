package Review;

import java.util.ArrayList;
import java.util.Arrays;

public class LeetCode1414 {
    ArrayList<Integer> arrayList;
    public int findMinFibonacciNumbers(int k) {
        arrayList = new ArrayList<>();
        int a = 1, b = 1, c = 0;
        while (b <= k){
            arrayList.add(b);
            c = a;
            a = b;
            b = c + b;
        }
        int[] dp = new int[k + 1];
        Arrays.fill(dp, k + 1);
        dp[0] = 0;
        for (int i = 1; i <= k; i++) {
            for (int j = 0; j < arrayList.size(); j++) {
                if (arrayList.get(j) <= i){
                    dp[i] = Math.min(dp[i], dp[i - arrayList.get(j)]) + 1;
                } else {
                    break;
                }
            }
        }
        return dp[k];
    }
}
