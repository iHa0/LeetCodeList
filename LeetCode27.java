public class LeetCode27 {
    public int removeElement(int[] nums, int val) {
        int left = 0, right = 0,len = nums.length;
        while (right < len){
            if (nums[right] == val){
                right++;
            }else {
                nums[left] = nums[right];
                left++;
                right++;
            }

        }
        return left;
    }
}
