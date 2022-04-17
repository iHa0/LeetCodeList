/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = dummy, cur1 = head, cur2 = head;
        int count = 0;
        while (cur2 != null) {
            while (cur2 != null && cur1.val == cur2.val) {
                count++;
                cur2 = cur2.next;
            }
            if (count == 1) pre = pre.next;
            else pre.next = cur2;
            cur1 = cur2;
            count = 0;
        }
        return dummy.next;
    }
}
