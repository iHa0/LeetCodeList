public class LeetCode1014 {
    public int maxScoreSightseeingPair(int[] values) {
        int len = values.length;
        if (len == 2)
            return values[1] + values[0] - 1;
        int pre_max = values[0], res = 0;
        for (int i = 1; i < len; i++) {
            res = Math.max(res, pre_max + values[i] - i);
            pre_max = Math.max(pre_max, values[i] + i);
        }
        return res;
    }
}
