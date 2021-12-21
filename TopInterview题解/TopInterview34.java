package TopInterview;

public class TopInterview34 {
    public int[] searchRange(int[] nums, int target) {
        int len = nums.length;
        int[] res = new int[]{-1,-1};
        if (len == 0)
            return res;
        int left = 0, right = len - 1, mid = 0;
        while (left <= right){
            mid = (left + right) / 2;
            if (nums[mid] == target){
                int a = mid, b = mid;
                while (a >= 0 && nums[a] == target)
                    a--;
                while (b < len && nums[b] == target)
                    b++;
                res[0] = a + 1;
                res[1] = b - 1;
                return res;
            }
            if (nums[mid] > target){
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        return res;
    }
}
