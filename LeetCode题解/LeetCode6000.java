package Review;

import java.util.Arrays;

public class LeetCode6000 {
    public int[] sortEvenOdd(int[] nums) {
        int len = nums.length;
        if (len <= 2)
            return nums;
        int oulen = 0;
        if (len % 2 == 0)
            oulen = len / 2;
        else
            oulen = len / 2 + 1;
        int[] ji = new int[len / 2];
        int[] ou = new int[oulen];
        int jic = 0, ouc = 0;
        for (int i = 0; i < len; i++) {
            if (i % 2 == 0){
                ou[ouc++] = nums[i];
            } else {
                ji[jic++] = nums[i];
            }
        }
        Arrays.sort(ji);
        Arrays.sort(ou);
        int left = 0, right = ou.length - 1;
        while (left < right){
            int temp = ji[right];
            ji[right] = ji[left];
            ji[left] = temp;
            left++;
            right--;
        }
        jic = 0;
        ouc = 0;
        for (int i = 0; i < len; i++) {
            if (i % 2 == 0){
                nums[i] = ou[ouc++];
            } else {
                nums[i] = ji[jic++];
            }
        }
        return nums;
    }
}
