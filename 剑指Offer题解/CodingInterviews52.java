import java.util.HashSet;
public class CodingInterviews52 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null){
            return null;
        }
        HashSet<ListNode> hashSet = new HashSet<>();
        ListNode p = headA, q = headB;
        while (p != null){
            hashSet.add(p);
            p = p.next;
        }
        while (q != null){
            if (hashSet.contains(q)){
                return q;
            }else {
                q = q.next;
            }
        }
        return null;
    }
}
