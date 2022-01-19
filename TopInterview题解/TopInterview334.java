package TopInterview;

public class TopInterview334 {
    public boolean increasingTriplet(int[] nums) {
        int len = nums.length;
        if (len < 3)
            return false;
        int small = Integer.MAX_VALUE, mid = Integer.MAX_VALUE;
        for (int a : nums) {
            if (a <= small){
                small = a;
            }else if (a <= mid){
                mid = a;
            }else if (a > mid){
                return true;
            }
        }
        return false;
    }
}
