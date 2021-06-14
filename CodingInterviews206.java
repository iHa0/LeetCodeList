public class CodingInterviews206 {
    public ListNode reverseList(ListNode head) {
        if (head == null)
            return null;
        if (head.next == null)
            return head;
        ListNode newHead = new ListNode(-1), p = head,q = head;
        newHead.next = null;
        while (p != null){
            q = p.next;
            p.next = newHead.next;
            newHead.next = p;
            p = q;
        }
        return newHead.next;
    }
}
