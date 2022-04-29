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
    public boolean isPalindrome(ListNode head) {
        if (head == null) return true;
        ListNode p = head, q = head;
        while (p != null && q != null && q.next != null && q.next.next != null) {
            p = p.next;
            q = q.next.next;
        }
        ListNode newHead = p.next;
        p.next = null;
        p = head;
        q = reverseListNode(newHead);
        while (p != null && q != null) {
            if (p.val != q.val) return false;
            p = p.next;
            q = q.next;
        }
        return true;
    }

    private ListNode reverseListNode(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode p = reverseListNode(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }
}
