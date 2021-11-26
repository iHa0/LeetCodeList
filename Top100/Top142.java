package Top100;

public class Top142 {
    public ListNode detectCycle(ListNode head) {
        if (head == null)
            return null;
        if (head.next == null)
            return null;
        ListNode p = head, q = head;
        while (p != null && q != null && q.next != null){
            p = p.next;
            q = q.next.next;
            if (p == q){
                q = head;
                while (p != q){
                    p = p.next;
                    q = q.next;
                }
                return p;
            }
        }
        return null;
    }
}
