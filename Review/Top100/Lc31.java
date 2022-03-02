import java.util.Arrays;

public class LeetCode31 {
    public void nextPermutation(int[] nums) {
        int len = nums.length;
        int left = len - 2, right = len - 1;
        for (; left >= 0; left--) {
            if (nums[left] < nums[left + 1])
                break;
        }
        if (left < 0){
            Arrays.sort(nums);
            return;
        }
        for (; right > left; right--) {
            if (nums[left] < nums[right])
                break;
        }
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
        Arrays.sort(nums, left + 1, len);
    }
}
