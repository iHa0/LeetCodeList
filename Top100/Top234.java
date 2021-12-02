package Top100;

import java.util.ArrayList;

public class Top234 {
    public boolean isPalindrome(ListNode head) {
        int len = 0, left = 0, right = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        ListNode p = head;
        while (p != null){
            arrayList.add(p.val);
            p = p.next;
        }
        Integer[] nums = arrayList.toArray(new Integer[arrayList.size()]);
        len = nums.length;
        right = len - 1;
        while (left < right){
            if (nums[left] == nums[right]){
                left++;
                right--;
            }else
                return false;
        }
        return true;
    }
}
