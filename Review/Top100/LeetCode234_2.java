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
    ListNode p;
    public boolean isPalindrome(ListNode head) {
        this.p = head;
        return dfs(head);
    }

    private boolean dfs(ListNode head) {
        if (head == null) return true;
        boolean res = dfs(head.next) && (head.val == p.val);
        p = p.next;
        return res;
    }
}
