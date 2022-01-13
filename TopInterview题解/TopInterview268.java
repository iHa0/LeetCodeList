package TopInterview;

public class TopInterview268 {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        int sum = 0;
        for (int i = 0; i <= len; i++) {
            sum += i;
        }
        int temp = 0;
        for (int i = 0; i < len; i++) {
            temp += nums[i];
        }
        return sum - temp;
    }
}
