import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Top78 {
    List<List<Integer>> res = new LinkedList<>();
    HashSet<LinkedList<Integer>> hashSet = new HashSet<>();
    public List<List<Integer>> subsets(int[] nums) {
        res.add(new LinkedList<>());
        LinkedList<Integer> list = new LinkedList<>();
        back(nums, list);
        return res;
    }

    public void back(int[] nums, LinkedList<Integer> list){
        for (int i = 0; i < nums.length; i++) {
            if (list.contains(nums[i]))
                continue;
            LinkedList<Integer> temp = new LinkedList<>(list);
            temp.add(nums[i]);
            Collections.sort(temp);
            if (!hashSet.contains(temp)){
                hashSet.add(temp);
                list.add(nums[i]);
                res.add(new LinkedList<>(list));
            }else
                continue;
            back(nums, list);
            list.removeLast();
        }
    }
}
