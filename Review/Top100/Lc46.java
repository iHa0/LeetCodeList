package Top100Review;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lc46 {
    int[] nums;
    int len;
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        this.nums = nums;
        this.len = nums.length;
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
            int num = nums[i];
            if (list.contains(num))
                continue;
            list.add(num);
            back(list);
            list.removeLast();
        }
    }
}
