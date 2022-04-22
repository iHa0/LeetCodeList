import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();
        int h = word1.length(), l = word2.length();
        dp[0][0] = 0;
        for (int i = 0; i <= h; i++) {
        	dp[i][0] = i;
        }
        for (int j = 0; j <= l; j++) {
        	dp[0][j] = j;
        }
        for (itn i = 1; i <= h; i++) {
        	for (int j = 1; j <= l; j++) {
        		if (word1.charAt(i - 1) == word2.charAt(j - 1)) dp[i][j] = dp[i - 1][j - 1];
        		else {
        			dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + 1;
        		}
        	}
        }
        System.out.println(dp[h][l]);
    }
}
