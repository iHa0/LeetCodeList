public class Top34 {
    public int[] searchRange(int[] nums, int target) {
        int left = 0, right = nums.length - 1, mid, flag = -1;
        while (left <= right){
            mid = (left + right) / 2;
            if (nums[mid] == target){
                flag = mid;
            }
            if (nums[mid] <= target && nums[right] >= target){
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        if (flag == -1) {
            return new int[]{-1, -1};
        }
        int i = flag, j = flag;
        while ((i >= 0 && nums[i] == target) || (j < nums.length && nums[j] == target)){
            if (i >= 0 && nums[i] == target)
                i--;
            if (j < nums.length && nums[j] == target)
                j++;
        }
        return new int[]{i + 1, j - 1};
    }
}
