class Solution {
    int target;
    List<List<Integer>> res = new ArrayList<>();
    int len;
    int[] candidates;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        this.candidates = candidates;
        this.len = candidates.length;
        this.target = target;
        LinkedList<Integer> list = new LinkedList<>();
        back(list, 0, 0);
        return res;
    }

    private void back(LinkedList<Integer> list, int index, int sum) {
        if (sum == target) {
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = index; i < len; i++) {
            sum += candidates[i];
            if (sum > target) return;
            list.add(candidates[i]);
            back(list, i, sum);
            list.removeLast();
            sum -= candidates[i];
        }
    }
}
