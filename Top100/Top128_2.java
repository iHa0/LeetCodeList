import java.util.HashSet;

public class Top128_2 {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        int max = Integer.MIN_VALUE;
        for (int i:
             nums) {
            hashSet.add(i);
        }
        for (int num:
             hashSet) {
            if (!hashSet.contains(num - 1)){
                int cur = num;
                int count = 1;
                while (hashSet.contains(cur + 1)){
                    cur++;
                    count++;
                }
                if (max < count)
                    max = count;
            }

        }
        if (max == Integer.MIN_VALUE)
            return 0;
        return max;
    }
}
