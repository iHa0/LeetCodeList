package TopInterview;

import java.util.Arrays;

public class TopInterview324 {
    public void wiggleSort(int[] nums) {
        int len = nums.length;
        int[] numss = new int[len];
        for (int i = 0; i < len; i++) {
            numss[i] = nums[i];
        }
        Arrays.sort(numss);
        int right = len - 1, left;
        if (len % 2 == 0){
            left = len / 2 - 1;
        }else {
            left = len / 2;
        }
        int i = 0;
        while (i < len){
            if (i < len)
                nums[i++] = numss[left--];
            if (i < len)
                nums[i++] = numss[right--];
        }
        while (left > 0){
            nums[i++] = numss[left--];
        }
    }
}
