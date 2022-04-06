class Solution {
    public int[][] findContinuousSequence(int target) {
        int len = target / 2 + 1;
        int[] basics = new int[len];
        for (int i = 0; i < len; i++) {
            basics[i] = i + 1;
        }
        int left = 0, right = 0;
        int sum = 0;
        List<int[]> list = new ArrayList<>();
        while (right < len) {
            int a = basics[right++];
            sum += a;
            if (sum == target) {
                int[] temp = new int[right - left];
                for (int i = 0; i < right - left; i++) {
                    temp[i] = basics[left + i];
                }
                list.add(temp);
            }
            while (sum > target) {
                int b = basics[left++];
                sum -= b;
                if (sum == target) {
                    int[] temp = new int[right - left];
                    for (int i = 0; i < right - left; i++) {
                        temp[i] = basics[left + i];
                    }
                    list.add(temp);
                }
            }
        }
        return list.toArray(new int[list.size()][]);
    }   
}
