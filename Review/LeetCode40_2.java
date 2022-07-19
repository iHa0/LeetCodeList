class Solution {
    List<List<Integer>> res = new ArrayList<>();
    int[] candidates;
    int target, len;

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        this.candidates = candidates;
        this.target = target;
        this.len = candidates.length;
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
            if (i > index && candidates[i] == candidates[i - 1]) continue;
            sum += candidates[i];
            list.add(candidates[i]);
            back(list, i + 1, sum);
            sum -= candidates[i];
            list.removeLast();
        }
    }
}
