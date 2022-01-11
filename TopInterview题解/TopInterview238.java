package TopInterview;

public class TopInterview238 {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        int p = 1, q = 1;
        for (int i = 0; i < len; i++) {
            res[i] = p;
            p *= nums[i];
        }
        for (int i = len - 1; i > 0; i--) {
            q *= nums[i];
            res[i - 1] *= q;
        }
        return res;
    }
}
