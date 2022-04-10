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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode start = dummy, end = dummy, pre = dummy, nex = dummy;
        for (int i = 0; i < left - 1; i++) {
            pre = pre.next;
        }
        start = pre.next;
        for (int i = 0; i < right; i++) {
            end = end.next;
        }
        nex = end.next;
        end.next = null;
        pre.next = reverseListNode(start);
        start.next = nex;
        return dummy.next;
    }

    private ListNode reverseListNode(ListNode root) {
        if (root == null || root.next == null) return root;
        ListNode p = reverseListNode(root.next);
        root.next.next = root;
        root.next = null;
        return p; 
    }
}
