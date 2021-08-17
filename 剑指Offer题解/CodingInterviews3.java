import java.util.HashSet;

public class CodingInterviews3 {
    public int findRepeatNumber(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        int p;
        for (int i = 0; i < nums.length; i++) {
            p = nums[i];
            if (hashSet.contains(p)){
                return p;
            }else {
                hashSet.add(p);
            }
        }
        return 0;
    }
}
