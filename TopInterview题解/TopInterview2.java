package TopInterview;

public class TopInterview2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int flag = 0;
        ListNode head = new ListNode(-1);
        ListNode h = head;
        int n1 = 0, n2 = 0;
        ListNode p = l1, q = l2;
        while (p != null && q != null){
            n1 = p.val;
            n2 = q.val;
            int sum = n1 + n2 + flag;
            if (sum >= 10){
                sum %= 10;
                flag = 1;
            }else
                flag = 0;
            h.next = new ListNode(sum);
            h = h.next;
            p = p.next;
            q = q.next;
        }
        while (p != null){
            int sum = flag + p.val;
            if (sum >= 10){
                sum %= 10;
                flag = 1;
            }else
                flag = 0;
            h.next = new ListNode(sum);
            h = h.next;
            p = p.next;
        }
        while (q != null){
            int sum = flag + q.val;
            if (sum >= 10){
                sum %= 10;
                flag = 1;
            }else
                flag = 0;
            h.next = new ListNode(sum);
            h = h.next;
            q = q.next;
        }
        if (flag == 0)
            return head.next;
        if (flag == 1){
            h.next = new ListNode(flag);
        }
        return head.next;
    }
}
