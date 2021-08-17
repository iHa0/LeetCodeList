public class CodingInterviews18 {
    public ListNode deleteNode(ListNode head, int val) {
        if (head == null || (head.next == null && head.val == val))
            return null;
        if (head.val == val && head.next != null){
            return head.next;
        }
        ListNode p = head.next , pre = head;
        while (p != null){
            if (p.val == val){
                pre.next = p.next;
                p = p.next;
                continue;
            }
            p = p.next;
            pre = pre.next;
        }
        return head;
    }
}
