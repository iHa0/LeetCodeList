class Solution {
    public int[][] findContinuousSequence(int target) {
        List<int[]> list = new ArrayList<>();
        int i = 1, j = 2, s = 3;
        while (i < j) {
            if (s == target) {
                int[] temp = new int[j - i + 1];
                for (int a = i; a <= j; a++) {
                    temp[a - i] = a;
                }
                list.add(temp);
            }
            if (s < target) {
                j++;
                s += j;
            } else {
                s -= i;
                i++;
            }
        }
        return list.toArray(new int[0][]);
    }
}
