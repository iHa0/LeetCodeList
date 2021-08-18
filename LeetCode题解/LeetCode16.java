import java.util.Arrays;

public class LeetCode16 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int left;
        int right;
        int numsSize = nums.length;

        int min = Integer.MAX_VALUE;
        int res = Integer.MAX_VALUE;

        for(int i=0; i<numsSize-2; i++){
            left = i+1;
            right = numsSize - 1;
            while(right > left){
                int cur = nums[i] + nums[left] + nums[right];
                if(cur == target){
                    return target;
                }else if(cur > target){
                    if(cur - target < min){
                        min = cur - target;
                        res = cur;
                    }
                    right--;
                }else{
                    if(target - cur < min){
                        min = target - cur;
                        res = cur;
                    }
                    left++;
                }
            }
        }
        return res;
    }
}
