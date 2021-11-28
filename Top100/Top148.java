package Top100;

import java.util.ArrayList;
import java.util.Arrays;

public class Top148 {
    public ListNode sortList(ListNode head) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ListNode p = head;
        while (p != null){
            arrayList.add(p.val);
            p = p.next;
        }
        int[] nums = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            nums[i] = arrayList.get(i);
        }
        quickSort(nums, 0, nums.length - 1);
        p = head;
        int index = 0;
        while (p != null && index < nums.length){
            p.val = nums[index++];
            p = p.next;
        }
        return head;
    }
    public void quickSort(int[] nums, int low, int high){
        if (low < high){
            int pivotIndex = partition(nums, low, high);
            quickSort(nums, low, pivotIndex - 1);
            quickSort(nums, pivotIndex + 1, high);
        }
    }
    public int partition(int[] nums, int low, int high){
        int pivot = nums[low];
        while (low < high){
            while (low < high && nums[high] >= pivot)
                high--;
            nums[low] = nums[high];
            while (low < high && nums[low] <= pivot)
                low++;
            nums[high] = nums[low];
        }
        nums[low] = pivot;
        return low;
    }
}
