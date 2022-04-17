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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p = l1, q = l2;
        ListNode newHead = new ListNode(-1), cur = newHead;
        int sum = 0, carry = 0, a = 0, b = 0;
        while (p != null || q != null) {
            a = p != null ? p.val : 0;
            b = q != null ? q.val : 0;
            sum = a + b + carry;
            carry = sum / 10;
            cur.next = new ListNode(sum % 10);
            cur = cur.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
            sum = 0;
        }
        if (carry == 1) {
            cur.next = new ListNode(1);
        }
        return newHead.next;
    }
}
