package TopInterview;

public class TopInterview26 {
    int[] nums;
    public int removeDuplicates(int[] nums) {
        this.nums = nums;
        int left = 0, right = 0;
        while (right < nums.length){
            if (nums[left] == nums[right]){
                right++;
                continue;
            }
            if (nums[left] != nums[right]){
                left++;
                swap(left, right);
                right++;
            }
        }
        return left + 1;
    }
    public void swap(int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
