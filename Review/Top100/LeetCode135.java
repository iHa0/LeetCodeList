class Solution {
    public int candy(int[] ratings) {
        int len = ratings.length, res = 0;
        int[] left = new int[len];
        int[] right = new int[len];
        Arrays.fill(left, 1);
        Arrays.fill(right, 1);
        for (int i = 1; i < len; i++) {
            if (ratings[i] > ratings[i - 1]) left[i] = left[i - 1] + 1;
        }
        res += left[len - 1];
        for (int j = len - 2; j >= 0; j--) {
            if (ratings[j] > ratings[j + 1]) right[j] = right[j + 1] + 1;
            res += Math.max(left[j], right[j]);
        }
        return res;
    }
}
