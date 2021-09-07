/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int x = 0;  // 进位
        ListNode dummy = new ListNode(0);   // 哑节点
        ListNode node = dummy;
        
        while(l1 != null || l2 != null || x != 0) {
            int sum = x;    // 当前位的和
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            node.next = new ListNode(sum % 10);
            x = sum / 10;
            node = node.next;
        }
        return dummy.next;
    }
}
