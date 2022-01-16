package TopInterview;

public class CodeInterview51 {
    int count;
    public int reversePairs(int[] nums) {
        this.count = 0;
        sort(nums, 0, nums.length - 1, new int[nums.length]);
        return count;
    }

    private void sort(int[] nums, int left, int right, int[] temp) {
        if (left < right){
            int mid = left + (right - left) / 2;
            sort(nums, left, mid, temp);
            sort(nums, mid + 1, right, temp);
            merge(nums, left, mid, right, temp);
        }
    }

    private void merge(int[] nums, int left, int mid, int right, int[] temp) {
        int i = left, j = mid + 1;
        int t = 0;
        while (i <= mid && j <= right){
            if (nums[i] <= nums[j]){
                temp[t++] = nums[i++];
            }else {
                count += (mid - i + 1);
                temp[t++] = nums[j++];
            }
        }
        while (i <= mid){
            temp[t++] = nums[i++];
        }
        while (j <= right){
            temp[t++] = nums[j++];
        }
        t = 0;
        while (left <= right){
            nums[left++] = temp[t++];
        }
    }
}
