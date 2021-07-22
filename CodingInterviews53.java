public class CodingInterviews53 {
  
    public int missingNumber(int[] nums) {
        int i = 0, j = nums.length - 1;
        while (i <= j){
            int n = (i + j) / 2;
            if (nums[n] == n){
                i = n + 1;
            }else {
                j = n - 1;
            }
        }
        return i;
    }
}
