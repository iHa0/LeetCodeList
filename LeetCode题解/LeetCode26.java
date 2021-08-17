public class LeetCode26 {
    public int removeDuplicates(int[] nums) {
        int i, j = 0, n = nums.length;
        for (i = 0; i < n; i++) {
            if (nums[i] != nums[j]){
                nums[++j] = nums[i];
            }
        }
        return j + 1;
    }
}
