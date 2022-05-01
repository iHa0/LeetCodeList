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
        ListNode pre = head, p = head, q = head;
        while (q != null) {
            while (q != null && q.val == pre.val) q = q.next;
            if (q != null) {
                pre.next = q;
                pre = q;
            } 
            else pre.next = null;
        }
        return head;
    }
}
