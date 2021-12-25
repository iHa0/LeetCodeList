package TopInterview;

import java.util.*;

public class TopInterview78 {
    List<List<Integer>> res;
    int[] nums;
    int len;
    HashSet<Integer> hashSet;
    public List<List<Integer>> subsets(int[] nums) {
        this.len = nums.length;
        this.res = new LinkedList<>();
        this.nums = nums;
        this.hashSet = new HashSet<>();
        LinkedList<Integer> list = new LinkedList<>();
        back(list, 0);
        return res;
    }
    public void back(LinkedList<Integer> list, int index){
        res.add(new LinkedList<>(list));
        for (int i = index; i < len; i++) {
            int temp = nums[i];
            if (list.contains(temp))
                continue;
            list.add(temp);
            back(list, i + 1);
            list.removeLast();
        }
    }
}
