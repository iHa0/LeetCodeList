package Review;

public class LeetCode704 {
    public int search(int[] nums, int target) {
        int len = nums.length;
        int left = 0, right = len - 1;
        while (left < right){
            int mid = left + (right - left) / 2;
            int temp = nums[mid];
            if (temp == target)
                return mid;
            if (temp > target)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return -1;
    }
}
