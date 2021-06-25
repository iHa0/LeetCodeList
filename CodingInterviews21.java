public class CodingInterviews21 {
    public int[] exchange(int[] nums) {
        if (nums.length == 0 || nums.length == 1){
            return nums;
        }
        int i = 0, j, len = nums.length;
        j = len - 1;
        while (i < j){
            while (nums[i] % 2 == 1 && i < len-1){
                i++;
            }
            while (nums[j] % 2 == 0 && j > 0){
                j--;
            }
            if (i < j){
                int a = nums[i];
                nums[i] = nums[j];
                nums[j] = a;
            }
        }
        return nums;
    }
}
