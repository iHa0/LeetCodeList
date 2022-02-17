package Top100Review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Lc47_2 {
    List<List<Integer>> res = new ArrayList<>();
    int[] nums;
    int len;
    boolean[] used;
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        this.nums = nums;
        this.len = nums.length;
        this.used = new boolean[len];
        LinkedList<Integer> list = new LinkedList<>();
        dfs(list);
        return res;
    }

    private void dfs(LinkedList<Integer> list) {
        if (list.size() == len){
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < len; i++) {
            if (used[i])
                continue;
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])
                continue;
            used[i] = true;
            list.add(nums[i]);
            dfs(list);
            used[i] = false;
            list.removeLast();
        }
    }
}
