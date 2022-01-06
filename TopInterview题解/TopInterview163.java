package TopInterview;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class TopInterview163 {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> list = new ArrayList<>();
        int len = nums.length;
        String temp;
        if (len == 0){
            temp = "";
            if (lower == upper){
                temp += lower + "";
            }else {
                temp += lower + "->" + upper;
            }
            list.add(temp);
            return list;
        }
        if (lower < nums[0]){
            temp = "";
            if (nums[0] - lower > 1){
                temp += lower + "->" + (nums[0] - 1);
            }else {
                temp += lower;
            }
            list.add(temp);
        }
        for (int i = 0; i < len - 1; i++) {
            int a = nums[i];
            int b = nums[i + 1];
            if (a <= upper && a >= lower){
                temp = "";
                if (b - a > 2){
                    temp += (a + 1) + "->" + (b - 1);
                }else {
                    if (a + 1 == b)
                        continue;
                    else {
                        temp += a + 1 + "";
                    }
                }
                list.add(temp);
            }
        }
        if (upper > nums[len - 1]){
            temp = "";
            if (upper - nums[len - 1] > 1){
                temp += (nums[len - 1] + 1) + "->" + upper;
            }else {
                temp += upper;
            }
            list.add(temp);
        }
        return list;
    }
}
