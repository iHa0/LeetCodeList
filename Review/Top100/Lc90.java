import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LeetCode90_2 {
    List<List<Integer>> res = new ArrayList<>();
    int[] nums;
    int len;
    boolean used[];
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        this.nums = nums;
        this.len = nums.length;
        this.used = new boolean[len];
        LinkedList<Integer> list = new LinkedList<>();
        back(list, 0);
        return res;
    }

    private void back(LinkedList<Integer> list, int index) {
        res.add(new ArrayList<>(list));
        for (int i = index; i < len; i++) {
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])
                continue;
            list.add(nums[i]);
            used[i] = true;
            back(list, i + 1);
            used[i] = false;
            list.removeLast();
        }
    }
}
