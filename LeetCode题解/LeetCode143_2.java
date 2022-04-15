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
    public void reorderList(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode h1 = slow.next;
        slow.next = null;
        ListNode newHead = reverseList(h1);
        h1 = head;
        ListNode nxt = head, newNxt = newHead;
        while (newNxt != null) {
            nxt = nxt.next;
            newNxt = newNxt.next;
            h1.next = newHead;
            newHead.next = nxt;
            newHead = newNxt;
            h1 = nxt;
        }
    }

    private ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }
}
