class Solution {
    private List<List<Integer>> res = new ArrayList<>();
    private int[] nums;
    private int len;
    public List<List<Integer>> permute(int[] nums) {
        this.nums = nums;
        this.len = nums.length;
        LinkedList<Integer> list = new LinkedList<>();
        back(list);
        return res;
    }

    private void back(LinkedList<Integer> list) {
        if (list.size() == len) {
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < len; i++) {
            if (list.contains(nums[i])) continue;
            list.add(nums[i]);
            back(list);
            list.removeLast();
        }
    }
}
