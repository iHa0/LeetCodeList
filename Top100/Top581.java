package Top100;

import java.util.Arrays;

public class Top581 {
    public int findUnsortedSubarray(int[] nums) {
        int len = nums.length;
        if (len == 0 || len == 1)
            return 0;
        int[] newNums = nums.clone();
        Arrays.sort(newNums);
        int left = 0, right = len - 1;
        while (left <= right){
            if (nums[left] != newNums[left] && nums[right] != newNums[right])
                break;
            if (nums[left] == newNums[left])
                left++;
            if (nums[right] == newNums[right])
                right--;
        }
        return (right - left + 1) < 0 ? 0 : right - left + 1;
    }
}
