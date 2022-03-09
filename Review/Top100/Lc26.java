public class LeetCode26 {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int left = 1, right = 1;
        while (right < len){
            while (right < len && nums[right] == nums[right - 1])
                right++;
            if (right >= len)
                return left;
            nums[left] = nums[right];
            left++;
            right++;
        }
        return left;
    }
}
