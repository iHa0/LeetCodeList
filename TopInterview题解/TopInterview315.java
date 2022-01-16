package TopInterview;

import java.util.ArrayList;
import java.util.List;

public class TopInterview315 {
    int[] index;
    int[] temp;
    int[] tempIndex;
    int[] ans;
    public List<Integer> countSmaller(int[] nums) {
        int len = nums.length;
        this.index = new int[len];
        this.temp = new int[len];
        this.tempIndex = new int[len];
        this.ans = new int[len];
        for (int i = 0; i < len; i++) {
            index[i] = i;
        }
        int left = 0, right = len - 1;
        mergeSort(nums, left, right);
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int a :
                ans) {
            arrayList.add(a);
        }
        return arrayList;
    }

    private void mergeSort(int[] nums, int left, int right) {
        if (left < right){
            int mid = left + (right - left) / 2;
            mergeSort(nums, left, mid);
            mergeSort(nums, mid + 1, right);
            merge(nums, left, mid, right);
        }
    }

    private void merge(int[] nums, int left, int mid, int right) {
        int i = left, j = mid + 1;
        int p = left;
        while (i <= mid && j <= right){
            if (nums[i] <= nums[j]){
                temp[p] = nums[i];
                tempIndex[p] = index[i];
                ans[index[i]] += (j - mid - 1);
                i++;
                p++;
            } else {
                temp[p] = nums[j];
                tempIndex[p] = index[j];
                j++;
                p++;
            }
        }
        while (i <= mid){
            temp[p] = nums[i];
            tempIndex[p] = index[i];
            ans[index[i]] += (j - mid - 1);
            i++;
            p++;
        }
        while (j <= right){
            temp[p] = nums[j];
            tempIndex[p] = index[j];
            j++;
            p++;
        }
        for (int k = left; k <= right; k++) {
            index[k] = tempIndex[k];
            nums[k] = temp[k];
        }
    }
}
