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
        int count = 0;
        while (q != null) {
            while (q != null && p.val == q.val) {
                count++;
                q = q.next;
            }
            if (count == 1) pre = pre.next;
            else pre.next = q;
            p = q;
            count = 0;
        }
        return dummy.next;
    }
}
