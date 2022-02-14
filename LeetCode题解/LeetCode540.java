public class LeetCode540 {
    public int singleNonDuplicate(int[] nums) {
        int len = nums.length;
        int left = 0, right = len - 1;
        while (left < right){
            int mid = (left + right) / 2;
            if (mid % 2 == 0){
                if (nums[mid] == nums[mid + 1]){
                    left = mid + 2;
                } else {
                    if (mid - 1 >= 0 && nums[mid] != nums[mid - 1])
                        return nums[mid];
                    right = mid - 2;
                }
            } else {
                if (nums[mid] == nums[mid - 1]){
                    left = mid + 1;
                } else {
                    if (mid + 1 < len && nums[mid] != nums[mid + 1])
                        return nums[mid];
                    right = mid - 1;
                }
            }
        }
        return nums[left];
    }
}
