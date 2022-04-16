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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;
        if (head.next == null && n == 1) return null;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode p = dummy, q = dummy;
        for (int i = 0; i < n; i++) {
            q = q.next;
        }
        while (q != null && q.next != null) {
            q = q.next;
            p = p.next;
        }
        p.next = p.next.next;
        return dummy.next;
     }
}
