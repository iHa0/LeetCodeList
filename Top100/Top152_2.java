package Top100;

public class Top152_2 {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE, pivot = 1;
        for (int i = 0; i < nums.length; i++) {
            pivot *= nums[i];
            max = Math.max(pivot, max);
            if (pivot == 0)
                pivot = 1;
        }
        pivot = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            pivot *= nums[i];
            max = Math.max(pivot, max);
            if (pivot == 0)
                pivot = 1;
        }
        return max;
    }

}
