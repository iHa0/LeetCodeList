/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        if (head == null || head.next == null) return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode p = dummy, q = dummy;
        for (int i = 0; i < k; i++) {
            q = q.next;
        }
        while (q != null && q.next != null) {
            p = p.next;
            q = q.next;
        }
        return p.next;
    }
}
