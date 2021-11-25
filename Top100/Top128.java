import java.util.Arrays;

public class Top128 {
    public int longestConsecutive(int[] nums) {
        if (nums.length <= 0)
            return 0;
        int maxInt = Arrays.stream(nums).max().getAsInt();
        int minInt = Arrays.stream(nums).min().getAsInt();
        int intMaxVal = Math.max(maxInt, -minInt) + 1;
        int[] temp = new int[intMaxVal * 2];
        for (int i = 0; i < nums.length; i++) {
            temp[nums[i] + intMaxVal] = 1;
        }
        int sum = 0, max = 0;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == 0){
                if (max < sum){
                    max = sum;
                }
                sum = 0;
            }else {
                sum++;
            }
        }
        if (max < sum){
            max = sum;
        }
        return max;
    }
}
