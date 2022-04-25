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
        ListNode p = head, q = head, pre = dummy;
        int val = 0;
        while (q != null) {
            while (q != null && p.val == q.val) {
                q = q.next;
                val++;
            }
            if (val > 1) {
                pre.next = q;
            } else {
                pre = pre.next;
            }
            p = q;
            val = 0;
        }
        return dummy.next;
    }
}
