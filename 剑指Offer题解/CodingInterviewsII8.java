public class CodingInterviewsII8 {
    public int minSubArrayLen(int target, int[] nums) {
        int len = nums.length;
        int l, r, min = Integer.MAX_VALUE, sum = 0;
        for (int i = 0; i < len; i++) {
            sum = 0;
            for (int j = i; j < len; j++) {
                sum += nums[j];
                if (sum >= target){
                    int temp = j - i + 1;
                    if (min > temp){
                        min = temp;
                        break;
                    }
                }
            }
        }
        if (min == Integer.MAX_VALUE)
            return 0;
        return min;
    }

    public int minSubArrayLen2(int target, int[] nums) {
        int left = 0;
        int total = 0;
        int ret = Integer.MAX_VALUE;
        for (int right = 0; right < nums.length; right++) {
            total += nums[right];
            while (total >= target) {
                ret = Math.min(ret, right - left + 1);
                total -= nums[left++];
            }
        }
        return ret > nums.length ? 0 : ret;
    }
}
