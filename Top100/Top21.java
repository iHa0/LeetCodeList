public class Top21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode p = l1, q = l2, h = head;
        while (p != null && q != null){
            if (p.val >= q.val){
                h.next = new ListNode(q.val);
                h = h.next;
                q = q.next;
            }else {
                h.next = new ListNode(p.val);
                h = h.next;
                p = p.next;
            }
        }
        if (p == null){
            h.next = q;
        }
        if (q == null){
            h.next = p;
        }

        return head.next;
    }
}
