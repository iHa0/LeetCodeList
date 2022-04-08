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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = dummy, start = dummy, end = dummy;
        while (end != null) {
            for (int i = 0; i < k && end != null; i++) {
                end = end.next;
            }
            if (end == null) break;
            start = start.next;
            ListNode nxt = end.next;
            end.next = null;
            pre.next = reverseListNode(start);
            start.next = nxt;
            pre = start;
            end = start;
        }
        return dummy.next;
    }
    private ListNode reverseListNode(ListNode start) {
        if (start == null || start.next == null) return start;
        ListNode p = reverseListNode(start.next);
        start.next.next = start;
        start.next = null;
        return p;
    }
}
