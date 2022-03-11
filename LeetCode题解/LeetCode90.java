import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LeetCode90 {
    List<List<Integer>> res = new ArrayList<>();
    int len;
    int[] nums;
    boolean[] used;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        this.nums = nums;
        this.len = nums.length;
        this.used = new boolean[len];
        Arrays.sort(nums);
        LinkedList<Integer> list = new LinkedList<>();
        back(0, list);
        return res;
    }

    private void back(int index, LinkedList<Integer> list) {
        res.add(new ArrayList<>(list));
        if (index >= len)
            return;
        for (int i = index; i < len; i++) {
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])
                continue;
            used[i] = true;
            list.add(nums[i]);
            back(i + 1, list);
            used[i] = false;
            list.removeLast();
        }
    }
}
