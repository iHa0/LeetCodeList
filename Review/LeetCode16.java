package Review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class LeetCode16 {
    public int threeSumClosest(int[] nums, int target) {
        int len = nums.length;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        Arrays.sort(nums);
        for (int i = 0; i < len - 2; i++) {
            int i1 = nums[i];
            int left = i + 1, right = len - 1;
            while (left < right){
                int sum = i1 + nums[left] + nums[right];
                if (sum == target){
                    return target;
                }
                if (sum > target){
                    int gap = Math.abs(sum - target);
                    if (hashMap.containsKey(sum)){
                        int push = hashMap.get(sum) > gap ? gap : hashMap.get(sum);
                        hashMap.put(sum, push);
                    }else {
                        hashMap.put(sum, gap);
                    }
                    right--;
                }else {
                    int gap = Math.abs(target - sum);
                    if (hashMap.containsKey(sum)){
                        int push = hashMap.get(sum) > gap ? gap : hashMap.get(sum);
                        hashMap.put(sum, push);
                    }else {
                        hashMap.put(sum, gap);
                    }
                    left++;
                }
            }
        }
        ArrayList<Integer> arrayList = new ArrayList<>(hashMap.keySet());
        int min = Integer.MAX_VALUE, minindex = Integer.MAX_VALUE;
        for (int a : arrayList) {
            if (hashMap.get(a) < min){
                min = hashMap.get(a);
                minindex = a;
            }
        }
        return minindex;
    }
}
