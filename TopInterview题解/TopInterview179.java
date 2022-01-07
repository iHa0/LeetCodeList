package TopInterview;

import java.util.Arrays;

public class TopInterview179 {
    public String largestNumber(int[] nums) {
        int len = nums.length;
        String[] ss = new String[len];
        for (int i = 0; i < len; i++) {
            ss[i] = nums[i] + "";
        }
        Arrays.sort(ss, (o1, o2) -> {
            String ab = o1 + o2, ba = o2 + o1;
            return ba.compareTo(ab);
        });
        String res = "";
        for (int i = 0; i < len; i++) {
            if (ss[0].equals("0"))
                return "0";
            res += ss[i];
        }
        return res;
    }
}

