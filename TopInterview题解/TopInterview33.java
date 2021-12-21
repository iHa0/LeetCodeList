package TopInterview;

public class TopInterview33 {
    public int search(int[] nums, int target) {
        int len = nums.length;
        int left = 0, right = len - 1, mid = 0;
        while (left <= right){
            int leftVal = nums[left];
            int rightVal = nums[right];
            mid = (left + right) / 2;
            int midVal = nums[mid];
            if (target == midVal)
                return mid;
            if (leftVal == target)
                return left;
            if (rightVal == target)
                return right;
            // 左边有序
            if (leftVal < midVal){
                if (target >= leftVal && target < midVal){
                    right = mid - 1;
                }else {
                    left = mid + 1;
                }
            // 右边有序
            }else {
                if (target <= rightVal && target > midVal){
                    left = mid + 1;
                }else
                    right = mid - 1;
            }
        }
        return -1;
    }
}
