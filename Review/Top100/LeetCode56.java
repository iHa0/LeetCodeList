class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (o1, o2) -> {
            return o1[0] == o2[0] ? o2[1] - o1[1] : o1[0] - o2[0];
        });
        List<int[]> list = new ArrayList<>();
        int a = intervals[0][0], b = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            int[] nums = intervals[i];
            if (nums[0] > b) {
                list.add(new int[]{a, b});
                a = nums[0];
                b = nums[1];
            } else if (nums[0] <= b && nums[0] > a && nums[1] > b) {
                b = nums[1];
            }
        }
        list.add(new int[]{a, b});
        int[][] res = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            res[i][0] = list.get(i)[0];
            res[i][1] = list.get(i)[1];
        }
        return res;
    }
}
