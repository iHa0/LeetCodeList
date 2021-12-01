package Top100;

public class Top215_2 {
    public int findKthLargest(int[] nums, int k) {
        quickSort(nums, 0, nums.length - 1);
        return nums[nums.length - k];
    }
    public void quickSort(int[] nums, int left, int right){
        if (left < right){
            int pivotIndex = sort(nums, left, right);
            quickSort(nums, left, pivotIndex - 1);
            quickSort(nums, pivotIndex + 1, right);
        }
    }
    public int sort(int[] nums, int left, int right){
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
