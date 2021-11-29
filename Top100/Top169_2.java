package Top100;

public class Top169_2 {
    public int majorityElement(int[] nums) {
        int pivot = nums[0], m = 0;
        for (int i = 0; i < nums.length; i++) {
            if (m <= 0)
                pivot = nums[i];
            m += pivot == nums[i] ? 1 : -1;
        }
        return pivot;
    }
}
