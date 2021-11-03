public class Top19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p = head, q = head, temp;
        if (head.next == null && n == 1)
            return null;
        if(n == 1){
            while (p != null){
                if (p.next.next == null){
                    p.next = null;
                    return head;
                }
                p = p.next;
            }
        }
        for (int i = 0; i < n; i++) {
            if (p.next != null){
                p = p.next;
            }else {
                head = head.next;
                return head;
            }
        }
        while (p != null){
            if (p.next != null){
                p = p.next;
                q = q.next;
            }else {
                break;
            }
        }
        if (q.next != null){
            temp = q.next;
            q.next = temp.next;
            temp.next = null;
        }
        return head;
    }
}
