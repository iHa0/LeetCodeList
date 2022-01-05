package TopInterview;

public class TopInterview160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p = headA, q = headB;
        while (p != null || q != null){
            if (p == null && q == null)
                return null;
            if (p == null)
                p = headB;
            if (q == null)
                q = headA;
            if (p == q)
                return p;
            p = p.next;
            q = q.next;
        }
        return null;
    }
}
