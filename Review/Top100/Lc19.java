package Top100Review;

public class Lc19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p = head, q = head;
        if (p.next == null && n == 1)
            return null;
        for (int i = 0; i < n; i++) {
            q = q.next;
        }
        if (q == null)
            return head.next;
        while (q.next != null){
            q = q.next;
            p = p.next;
        }
        p.next = p.next.next;
        return head;
    }
}
