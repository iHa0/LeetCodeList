class Solution {
    List<List<Integer>> res = new ArrayList<>();
    int[] candidates;
    int len, target;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        this.len = candidates.length;
        this.target = target;
        this.candidates = candidates;
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
            if (sum + candidates[i] > target) break;
            if (i > index && candidates[i - 1] == candidates[i]) continue;
            list.add(candidates[i]);
            sum += candidates[i];
            back(list, i + 1, sum);
            sum -= candidates[i];
            list.removeLast();
        }
    }
}
