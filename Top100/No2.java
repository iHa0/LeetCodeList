import java.util.Stack;

public class Top2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode q = res;
        int sum1 = 0, sum2 = 0, flag = 0;
        while (l1 != null && l2 != null){
            int a = l1.val;
            int b = l2.val;
            sum1 = a + b + flag;
            if (sum1 / 10 != 0){
                sum1 = sum1 % 10;
                flag = 1;
            }else
                flag = 0;
            ListNode p = new ListNode(sum1);
            q.next = p;
            q = p;
            l1 = l1.next;
            l2 = l2.next;
        }
        if (l1 == null){
            while (l2 != null){
                int b = l2.val;
                sum2 = b + flag;
                if (sum2 / 10 != 0){
                    sum2 = sum2 % 10;
                    flag = 1;
                }else
                    flag = 0;

                ListNode p = new ListNode(sum2);
                q.next = p;
                q = p;
                l2 = l2.next;
            }
        }
        if (l2 == null){
            while (l1 != null){
                int b = l1.val;
                sum2 = b + flag;
                if (sum2 / 10 != 0){
                    sum2 = sum2 % 10;
                    flag = 1;
                }else
                    flag = 0;
                ListNode p = new ListNode(sum2);
                q.next = p;
                q = p;
                l1 = l1.next;
            }
        }
        if (flag == 1){
            ListNode p = new ListNode(flag);
            q.next = p;
            q = p;
        }
        return res.next;
    }
}
