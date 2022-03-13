import java.util.ArrayList;
import java.util.List;

public class LeetCode229 {
    List<Integer> res = new ArrayList<>();
    public List<Integer> majorityElement(int[] nums) {
        int index1 = nums[0], count1 = 0;
        int index2 = nums[0], count2 = 0;
        for (int a : nums) {
            if (a == index1) {
                count1++;
                continue;
            }
            if (a == index2) {
                count2++;
                continue;
            }
            if (count1 == 0) {
                index1 = a;
                count1++;
                continue;
            }
            if (count2 == 0) {
                index2 = a;
                count2++;
                continue;
            }
            count1--;
            count2--;
        }

        count1 = 0;
        count2 = 0;
        for (int a : nums){
            if (index1 == a)
                count1++;
            else if (index2 == a)
                count2++;
        }
        if (count1 > nums.length / 3)
            res.add(index1);
        if (count2 > nums.length / 3)
            res.add(index2);
        return res;
    }
}
