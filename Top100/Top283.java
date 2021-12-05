package Top100;

public class Top283 {
    int[] nums;
    public void moveZeroes(int[] nums) {
        int left = 0, right = 0;
        this.nums = nums;
        while (right < nums.length){
            if (nums[right] != 0){
                swap(left, right);
                left++;
            }
            right++;
        }
    }
    public void swap(int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
