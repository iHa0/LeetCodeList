package TopInterview;

public class TopInterview19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null)
            return head;
        int num = n;
        ListNode p = head;
        ListNode q = head;
        while (n > 0 && q != null){
            q = q.next;
            n--;
        }
        if (q == null){
            head = head.next;
            return head;
        }
        while (q != null){
            if (q.next != null){
                q = q.next;
                p = p.next;
                continue;
            }
            break;
        }
        p.next = p.next.next;
        return head;
    }
}
