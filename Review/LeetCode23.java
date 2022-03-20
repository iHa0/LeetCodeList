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
    public ListNode mergeKLists(ListNode[] lists) {
        int len = lists.length;
        if (len == 0 || lists == null) return null;
        ListNode res = merge(lists, 0, len - 1);
        return res;
    }

    private ListNode merge(ListNode[] lists, int left, int right) {
        if (left == right) return lists[left];
        int mid = left + (right - left) / 2;
        ListNode l = merge(lists, left, mid);
        ListNode r = merge(lists, mid + 1, right);
        return mergeNode(l, r);
    }

    private ListNode mergeNode(ListNode l, ListNode r) {
        if (l == null) return r;
        if (r == null) return l;
        if (l.val < r.val) {
            l.next = mergeNode(l.next, r);
            return l;
        } else {
            r.next = mergeNode(l, r.next);
            return r;
        }
    }
}
