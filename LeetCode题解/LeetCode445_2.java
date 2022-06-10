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
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        l1 = reverseList(l1);
        l2 = reverseList(l2);
        int carry = 0, sum = 0;
        ListNode res = new ListNode(-1);
        ListNode p = res;
        while (l1 != null && l2 != null) {
            sum = 0;
            int a = l1.val, b = l2.val;
            l1 = l1.next;
            l2 = l2.next;
            sum = a + b + carry;
            carry = sum / 10;
            sum = sum % 10;
            ListNode temp = new ListNode(sum);
            temp.next = p.next;
            p.next = temp;
            p = p.next;
        }   
        while (l1 != null) {
            sum = l1.val + carry;
            carry = sum / 10;
            sum = sum % 10;
            ListNode temp = new ListNode(sum);
            temp.next = p.next;
            p.next = temp;
            p = p.next;
            l1 = l1.next;
        }
        while (l2 != null) {
            sum = l2.val + carry;
            carry = sum / 10;
            sum = sum % 10;
            ListNode temp = new ListNode(sum);
            temp.next = p.next;
            p.next = temp;
            p = p.next;
            l2 = l2.next;
        }
        if (carry != 0) {
            ListNode one = new ListNode(1);
            p.next = one;
        }
        ListNode ans = res.next;
        res.next = null;
        return reverseList(ans);
    }

    private ListNode reverseList(ListNode node) {
        if (node == null || node.next == null) return node;
        ListNode p = reverseList(node.next);
        node.next.next = node;
        node.next = null;
        return p;
    }
}
