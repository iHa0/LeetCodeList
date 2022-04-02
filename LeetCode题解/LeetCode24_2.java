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
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode p = head, q = head.next;
        head = q;
        while (p.next != null) {
            p.next = q.next;
            q.next = p;
            if (p.next != null && p.next.next != null) {
                ListNode temp = p;
                q = p.next.next;
                p = p.next;
                temp.next = q;
            } else {
                return head;
            }
        }
        return head;
    }
}
