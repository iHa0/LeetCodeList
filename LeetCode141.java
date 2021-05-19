public class LeetCode141 {
    public boolean hasCycle(ListNode head) {
        ListNode p = head,pt = head.next;
        if (head == null || head.next == null)
            return false;
        while ( p != pt){
            if (p == null || pt == null || pt.next == null){
                return false;
            }
            p = p.next;
            pt = pt.next.next;
        }
        return true;
    }
}
