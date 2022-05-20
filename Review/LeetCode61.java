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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;
        int len = 0;
        ListNode p = head, q = head, pre = head, newHead = head;
        while (p != null) {
            len++;
            p = p.next;
        }
        k = k % len;
        if (k == 0) return head;
        p = head;
        for (int i = 0; i < k; i++) q = q.next;
        while (q.next != null) {
            p = p.next;
            q = q.next;
        }
        newHead = p.next;
        p.next = null;
        q.next = head;
        return newHead;
    }
}
