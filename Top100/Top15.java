import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Top15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length < 3)
            return res;
        HashMap<List<Integer>, Integer> hashMap = new HashMap<>();
        Arrays.sort(nums);
        int left = 0, right = nums.length - 1, mid = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0){
                for (List<Integer> l:
                        hashMap.keySet()) {
                    res.add(l);
                }
                return res;
            }
            left = i + 1;
            right = nums.length - 1;
            while (left < right){
                if (nums[i] + nums[left] + nums[right] == 0){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    hashMap.put(list, hashMap.getOrDefault(list, 0) + 1);
                    left++;
                    right--;
                }
                if (nums[i] + nums[left] + nums[right] < 0){
                    left++;
                }
                if (nums[i] + nums[left] + nums[right] > 0){
                    right--;
                }
            }
        }


        for (List<Integer> l:
                hashMap.keySet()) {
            res.add(l);
        }
        return res;
    }

}
