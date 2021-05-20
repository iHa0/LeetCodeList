public class LeetCode160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null){
            return null;
        }
        HashSet<ListNode> hashSet = new HashSet<ListNode>();
        ListNode pa = headA,pb = headB;
        while (pa != null){
            hashSet.add(pa);
            pa = pa.next;
        }
        while (pb != null){
            if (hashSet.contains(pb)){
                return pb;
            }else {
                pb = pb.next;
            }
        }
        return null;
    }
}
