public class LeetCode75_2 {
    public void sortColors(int[] nums) {
        int len = nums.length;
        int p0 = 0, p2 = len - 1, index = 0;
        while (index <= p2){
            if (nums[index] == 0){
                swap(nums, p0, index);
                p0++;
                index++;
            } else if (nums[index] == 2){
                swap(nums, p2, index);
                p2--;
            } else {
                index++;
            }
        }
    }

    private void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
