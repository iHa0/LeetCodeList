import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CodingInterviewsII7 {
    public List<List<Integer>> threeSum(int[] nums) {
        int len = nums.length;
        List<List<Integer>> res = new LinkedList<>();
        Arrays.sort(nums);
        for (int i = 0; i <= len - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            int target = 0 - nums[i];
            for (int l = i + 1, r = len - 1; l < r;) {
                if (nums[l] + nums[r] == target){
                    List<Integer> temp = new LinkedList<>();
                    temp.add(nums[i]);
                    temp.add(nums[l]);
                    temp.add(nums[r]);
                    res.add(temp);
                    r--;
                    l++;
                    while (l < r && l < len - 1 && nums[l] == nums[l - 1])
                        l++;
                    while (l < r && r < len - 1 && nums[r] == nums[r + 1])
                        r++;

                }
                if (nums[l] + nums[r] > target)
                    r--;
                if (nums[l] + nums[r] < target)
                    l++;
            }
        }
        return res;
    }
}
