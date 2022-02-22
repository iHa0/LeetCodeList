public class LeetCode75 {
    public void sortColors(int[] nums) {
        int len = nums.length;
        int p0 = 0, p2 = len - 1, i = 0;
        while (i <= p2){
            if (nums[i] == 0){
                swap(nums, p0, i);
                p0++;
                i++;
            } else if (nums[i] == 1)
                i++;
            else if (nums[i] == 2){
                swap(nums, i, p2);
                p2--;
            }
        }
    }

    public void swap(int[] nums, int left, int right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
