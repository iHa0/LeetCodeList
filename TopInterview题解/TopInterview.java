package TopInterview;

import java.util.ArrayList;

public class TopInterview4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int len1 = nums1.length, len2 = nums2.length, index1 = 0, index2 = 0;
        while (index1 < len1 && index2 < len2){
            if (nums1[index1] > nums2[index2]){
                arrayList.add(nums2[index2++]);
            }else {
                arrayList.add(nums1[index1++]);
            }
        }
        while (index1 < len1){
            arrayList.add(nums1[index1++]);
        }
        while (index2 < len2){
            arrayList.add(nums2[index2++]);
        }
        double res;
        Integer[] temp = arrayList.toArray(new Integer[arrayList.size()]);
        int sum = len1 + len2;
        if (sum % 2 == 1){
            res = temp[sum / 2];
        }else {
            res = temp[sum / 2] + temp[sum / 2 - 1];
            res /= 2;
        }
        return (double)res;
    }
}
