package Top100;

public class TopInterview206 {
    public ListNode reverseList(ListNode head) {
        ListNode newHead = new ListNode(0);
        ListNode p = head, q = newHead.next;
        while (p != null){
            newHead.next = p;
            p = p.next;
            newHead.next.next = q;
            q = newHead.next;
        }
        return newHead.next;
    }
}
