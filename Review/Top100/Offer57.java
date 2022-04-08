class Solution {
    public int[][] findContinuousSequence(int target) {
        int i = 1, j = 2, s = 3;
        List<int[]> list = new ArrayList<>();
        while (i < j) {
            if (s == target) {
                int[] temp = new int[j - i + 1];
                for (int a = i; a <= j; a++) {
                    temp[a - i] = a;
                }
                list.add(temp);
            }
            if (s >= target) {
                s -= i;
                i++;
            } else {
                j++;
                s += j;
            }
        }
        return list.toArray(new int[0][]);
    }
}
