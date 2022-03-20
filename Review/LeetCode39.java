class Solution {
    int[] candidates;
    int len;
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        this.candidates = candidates;
        this.len = candidates.length;
        LinkedList<Integer> list = new LinkedList<>();
        back(list, 0, target);
        return res;
    }

    private void back(LinkedList<Integer> list, int index, int target) {
        if (target == 0) {
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = index; i < len; i++) {
            int cur = candidates[i];
            if (target - cur < 0) return;
            list.add(cur);
            back(list, i, target - cur);
            list.removeLast();
        }
    }
}
