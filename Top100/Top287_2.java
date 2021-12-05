package Top100;

public class Top287_2 {
    public int findDuplicate(int[] nums) {
        int p = nums[0], q = nums[nums[0]];
        while (p != q){
            p = nums[p];
            q = nums[nums[q]];
        }
        p = 0;
        while (p != q){
            p = nums[p];
            q = nums[q];
        }
        return p;
    }
}
