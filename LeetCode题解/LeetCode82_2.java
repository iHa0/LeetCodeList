public ListNode deleteDuplicates(ListNode head) {
    if (head == null) return head;
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode p = dummy, q = head;
    while (q != null) {
        if (q.next == null || q.val != q.next.val) {
            p.next = q;
            p = q;
        }
        while (q.next != null && q.val == q.next.val) q = q.next;
        q = q.next;
    }
    p.next = null;
    return dummy.next;   
}
