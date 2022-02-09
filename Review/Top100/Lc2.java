package Top100Review;

public class Lc2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);
        ListNode p = l1, q = l2, r = head;
        int flag = 0;
        while (p != null && q != null){
            int a = p.val + q.val + flag;
            if (a >= 10){
                flag = 1;
                a %= 10;
                r.next = new ListNode(a);
                r = r.next;
            } else {
                flag = 0;
                r.next = new ListNode(a);
                r = r.next;
            }
            p = p.next;
            q = q.next;
        }
        if (p == null){
            while (q != null){
                int a = q.val + flag;
                if (a >= 10){
                    flag = 1;
                    a %= 10;
                    r.next = new ListNode(a);
                    r = r.next;
                } else {
                    flag = 0;
                    r.next = new ListNode(a);
                    r = r.next;
                }
                q = q.next;
            }
        }

        if (q == null){
            while (p != null){
                int a = p.val + flag;
                if (a >= 10){
                    flag = 1;
                    a %= 10;
                    r.next = new ListNode(a);
                    r = r.next;
                } else {
                    flag = 0;
                    r.next = new ListNode(a);
                    r = r.next;
                }
                p = p.next;
            }
        }
        if (flag == 1)
            r.next = new ListNode(flag);
        return head.next;
    }
}
