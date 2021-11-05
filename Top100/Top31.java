import java.util.Arrays;
import java.util.LinkedList;

public class Top31 {
    public void nextPermutation(int[] nums) {
        int left = nums.length - 2, right = nums.length - 1;
        for (; left >= 0; left--) {
            if (nums[left] < nums[left + 1])
                break;
        }
        if (left < 0){
            Arrays.sort(nums);
            return;
        }
        for (; right > left; right--){
            if (nums[left] < nums[right])
                break;
        }
        int temp;
        temp = nums[right];
        nums[right] = nums[left];
        nums[left] = temp;
        Arrays.sort(nums, left + 1, nums.length);
    }
}
