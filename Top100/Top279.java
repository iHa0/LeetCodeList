package Top100;

public class Top279 {
    int count = 0, min = Integer.MAX_VALUE;
    public int numSquares(int n) {
        int end = (int) Math.sqrt(n);
        int[] nums = new int[end];
        for (int i = 0; i < end; i++) {
            nums[i] = (int) Math.pow((i + 1), 2);
        }
        back(nums, n);

        return min;
    }

    public void back(int[] nums, int target){
        if (target < 0 || count >= min)
            return;
        if (target == 0){
            if (count < min){
                min = count;
            }
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            if (target - nums[i] < 0)
                continue;
            count++;
            back(nums, target - nums[i]);
            count--;
        }
    }
}
