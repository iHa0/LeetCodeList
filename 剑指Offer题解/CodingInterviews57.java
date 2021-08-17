public class CodingInterviews57 {
    public int[] twoSum2(int[] nums, int target) {
        int len = nums.length, falg = 1;
        int[] res_zero = new int[0];
        int[] res = new int[2];
        if (len == 1){
            return res_zero;
        }
        int[] a = new int[100001];
        for (int i = 0; i < len; i++) {
            a[nums[i]] = 1;
        }
        for (int i = 0; i <= a.length; i++) {
            if (a[i] != 0 && a[target - i] != 0){
                res[0] = i;
                res[1] = target - i;
                falg = 0;
                break;
            }
        }
        if (falg == 1)
            return res_zero;
        return res;
    }

    public int[] twoSum(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        while (i < j){
            int s = nums[i] + nums[j];
            if (s < target){
                i ++;
            }else if (s > target){
                j --;
            }else {
                return new int[] {nums[i], nums[j]};
            }
        }

        return new int[0];
    }
}
