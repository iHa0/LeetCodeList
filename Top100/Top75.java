public class Top75_2 {
    public void sortColors(int[] nums) {
        int len = nums.length;
        int p0 = 0, p2 = len - 1;
        for (int i = 0; i <= p2; i++) {
            while (i <= p2 && nums[i] == 2){
                swap(nums, i, p2);
                p2--;
            }
            if (nums[i] == 0){
                swap(nums, i, p0);
                p0++;
            }
        }
    }
    public void swap(int[] nums, int left, int right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
