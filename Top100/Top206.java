package Top100;

public class Top206 {
    public ListNode reverseList(ListNode head) {
        if (head == null)
            return null;
        if (head.next == null)
            return head;
        ListNode pre = head, q = head.next;
        pre.next = null;
        while (q != null){
            ListNode temp = q;
            q = reverseNode(pre, q);
            pre = temp;
        }
        return pre;
    }
    public ListNode reverseNode(ListNode pre, ListNode q){
        ListNode temp = q.next;
        q.next = pre;
        return temp;
    }
}
