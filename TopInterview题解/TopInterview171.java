package TopInterview;

public class TopInterview171 {
    public int titleToNumber(String columnTitle) {
        long res = 0, sum = 0;
        char[] chars = columnTitle.toCharArray();
        int len = chars.length;
        for (int i = 0; i < len; i++) {
            sum *= 26;
            sum += chars[i] - 'A' + 1;
        }
        return (int) sum;
    }
}
