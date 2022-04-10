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
    int len;
    ListNode[] lists;
    public ListNode mergeKLists(ListNode[] lists) {
        this.lists = lists;
        this.len = lists.length;
        if (len == 0) return null;
        ListNode res = merge(0, len - 1);
        return res;
    }

    private ListNode merge(int left, int right) {
        if (left == right) return lists[left];
        int mid = left + (right - left) / 2;
        ListNode l1 = merge(left, mid);
        ListNode l2 = merge(mid + 1, right);
        return mergeNode(l1, l2);
    }

    private ListNode mergeNode(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if (l1.val < l2.val) {
            l1.next = mergeNode(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeNode(l1, l2.next);
            return l2;
        }
    }
}
