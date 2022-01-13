package TopInterview;

public class TopInterview283 {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        int left = 0, right = 0;
        while (right < len){
            if (nums[right] != 0){
                swap(nums, left, right);
                left++;
            }
            right++;
        }
    }

    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
