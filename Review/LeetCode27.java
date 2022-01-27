package Review;

public class LeetCode27 {
    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        int left = 0, right = len - 1, count = 0;
        while (left < right){
            while (left < right && nums[left] != val) left++;
            while (left < right && nums[right] == val) right--;
            if (left != right){
                nums[left] = nums[right];
                nums[right] = val;
            }
        }
        for (int a : nums) {
            if (a != val)
                count++;
            else
                break;
        }
        return count;
    }
}
