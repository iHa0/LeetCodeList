import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LeetCode46 {
    int[] nums;
    int len;
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        this.len = nums.length;
        this.nums = nums;
        LinkedList<Integer> list = new LinkedList<>();
        back(list);
        return res;
    }

    private void back(LinkedList<Integer> list) {
        if (list.size() == len){
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < len; i++) {
            if (list.contains(nums[i]))
                continue;
            list.add(nums[i]);
            back(list);
            list.removeLast();
        }
    }
}
