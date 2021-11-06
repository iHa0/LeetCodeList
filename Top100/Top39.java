import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Top39 {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        LinkedList<Integer> list = new LinkedList<>();
        back(candidates, target, list);
        return res;
    }

    public void back(int[] nums, int target, LinkedList<Integer> list){
        if (target == 0){
            res.add(new ArrayList<>(list));
            return;
        }
        if (target < 0)
            return;
        for (int i = 0; i < nums.length; i++) {
            if (!list.isEmpty() && list.getLast() > nums[i])
                continue;
            list.add(nums[i]);
            back(nums, target - nums[i], list);
            list.removeLast();
        }
    }
}
