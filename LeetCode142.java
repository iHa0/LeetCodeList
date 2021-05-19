public class LeetCode142 {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null){
            return null;
        }
        ListNode cur = head;
        Set<ListNode> set = new HashSet<ListNode>();
        while (cur != null){
            if (set.contains(cur)){
                return cur;
            }else {
                set.add(cur);
            }
            cur = cur.next;
        }
        return null;
    }
}
