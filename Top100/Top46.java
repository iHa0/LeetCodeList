import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Top46 {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        LinkedList<Integer> list = new LinkedList<>();
        back(nums, list);
        return res;
    }

    public void back(int[] nums, LinkedList<Integer> list){
        if (nums.length == list.size()){
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (list.contains(nums[i]))
                continue;
            list.add(nums[i]);
            back(nums, list);
            list.removeLast();
        }
    }
}
