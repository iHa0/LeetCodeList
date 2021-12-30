package TopInterview;

import java.util.HashSet;

public class TopInterview128 {
    public int longestConsecutive(int[] nums) {
        int len = nums.length;
        int max = 0;
        HashSet<Integer> hashSet = new HashSet<>();
        for (int a : nums) {
            hashSet.add(a);
        }
        int curNum, count;
        for (int a : nums) {
            if (!hashSet.contains(a - 1)){
                curNum = a;
                count = 1;
                while (hashSet.contains(curNum + 1)){
                    count++;
                    curNum++;
                }
                max = Math.max(max, count);
            }
        }
        return max;
    }
}
