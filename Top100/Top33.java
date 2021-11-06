public class Top33 {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1, mid;
        while (left <= right){
            mid = (left + right) / 2;
            //说明右边的有序
            if (nums[mid] < nums[right]){
                //
                if (nums[mid] == target)
                    return mid;
                //target在右边
                if (nums[mid] <= target && nums[right] >= target){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }else {
                //左边的有序
                if (nums[mid] == target)
                    return mid;
                if (nums[left] <= target && nums[mid]  >= target){
                    right = mid - 1;
                }else {
                    left = mid + 1;
                }
            }
        }
        return -1;
    }
}
