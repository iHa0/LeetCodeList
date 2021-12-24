package TopInterview;

public class TopInterview75_2 {
    public void sortColors(int[] nums) {
        quicksort(nums, 0, nums.length - 1);
    }
    public void quicksort(int[] nums, int left, int right){
        if (left < right){
            int pivot = part(nums, left, right);
            quicksort(nums, left, pivot - 1);
            quicksort(nums, pivot + 1, right);
        }
    }
    public int part(int[] nums, int left, int right){
        int pivot = nums[left];
        while (left < right){
            while (left < right && nums[right] >= pivot)
                right--;
            nums[left] = nums[right];
            while (left < right && nums[left] <= pivot)
                left++;
            nums[right] = nums[left];
        }
        nums[left] = pivot;
        return left;
    }
}
