package TopInterview;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TopInterview46 {
    List<List<Integer>> res = new ArrayList<>();
    int len;
    public List<List<Integer>> permute(int[] nums) {
        this.len = nums.length;
        LinkedList<Integer> list = new LinkedList<>();
        back(nums, list);
        return res;
    }
    public void back(int[] nums, LinkedList<Integer> list){
        if (list.size() == len){
            res.add(new LinkedList<>(list));
            return;
        }
        for (int i = 0; i < len; i++) {
            if (list.contains(nums[i]))
                continue;
            list.add(nums[i]);
            back(nums, list);
            list.removeLast();
        }
    }
}
