import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LeetCode39 {
    List<List<Integer>> res = new ArrayList<>();
    int[] candidates;
    int len;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        this.len = candidates.length;
        this.candidates = candidates;
        LinkedList<Integer> list = new LinkedList<>();
        back(list, target);
        return res;
    }

    private void back(LinkedList<Integer> list, int target) {
        if (target == 0){
            res.add(new ArrayList<>(list));
            return;
        }
        if (target < 0)
            return;
        for (int i = 0; i < len; i++) {
            if (!list.isEmpty() && list.getLast() > candidates[i])
                continue;
            list.add(candidates[i]);
            back(list, target - candidates[i]);
            list.removeLast();
        }
    }
}
