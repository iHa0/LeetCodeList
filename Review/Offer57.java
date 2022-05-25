class Solution {
    public int[][] findContinuousSequence(int target) {
        List<int[]> res = new ArrayList<>();
        int a = 1, b = 2, s = 3;
        while (a < b) {
            if (s == target) {
                int[] temp = new int[b - a + 1];
                for (int i = a; i <= b; i++) {
                    temp[i - a] = i;
                }
                res.add(temp);
            }
            if (s < target) {
                b++;
                s += b;
            } else {
                s -= a;
                a++;
            }
        }
        return res.toArray(new int[0][]);
    }
}
