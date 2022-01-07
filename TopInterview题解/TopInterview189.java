package TopInterview;

public class TopInterview189 {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        if (k > len)
            k %= len;
        int[] newNums = new int[len];
        for (int i = 0; i < len; i++) {
            newNums[i] = nums[i];
        }
        for (int i = 0; i < k; i++) {
            nums[i] = newNums[len - k + i];
        }
        for (int i = k; i < len; i++) {
            nums[i] = newNums[i - k];
        }
    }
}
