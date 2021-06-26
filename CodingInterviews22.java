public class CodingInterviews22 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        if (head == null || k == 0)
            return null;
        if (head.next == null)
            return head;
        ListNode p = head, q = head;
        while (k-- > 0){
            q = q.next;
        }
        while (q != null){
            q = q.next;
            p = p.next;
        }
        return p;
    }
}
