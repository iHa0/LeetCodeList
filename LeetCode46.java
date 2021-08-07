import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LeetCode46 {
    List<List<Integer>> res = new LinkedList<>();
    public List<List<Integer>> permute(int[] nums) {
        if (nums.length == 1){
            List<Integer> temp = new LinkedList<>();
            temp.add(nums[0]);
            res.add(temp);
            return res;
        }
        LinkedList<Integer> track = new LinkedList<>();
        back(track, nums);
        return res;
    }
    void back(LinkedList<Integer> track, int[] nums){
        if (track.size() == nums.length){
            res.add(new LinkedList<>(track));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (track.contains(nums[i])){
                continue;
            }
            track.add(nums[i]);
            back(track, nums);
            track.removeLast();
        }
    }
}
