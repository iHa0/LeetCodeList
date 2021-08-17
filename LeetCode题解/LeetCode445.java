public class LeetCode445 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p1 = l1, p2 = l2;
        int count1 = 0,count2 = 0,n1 = 0,n2 = 0,n = 0,sum = 0;
        Stack<ListNode> stack1 = new Stack<ListNode>();
        Stack<ListNode> stack2 = new Stack<ListNode>();
        if (p1 == null && p2 == null){
            ListNode rn = new ListNode(0);
            return rn;
        }
        if (p1 == null){
            return p2;
        }
        if (p2 == null){
            return p1;
        }
        while (p1 != null){
            stack1.add(p1);
            p1 = p1.next;
        }
        while (p2 != null){
            stack2.add(p2);
            p2 = p2.next;
        }
        ListNode firstHead = new ListNode(-101);
        ListNode cur = firstHead;
        firstHead.next = null;
        while (!stack1.isEmpty() && !stack2.isEmpty()){
            n1 = stack1.pop().val;
            n2 = stack2.pop().val;
            sum = n1 + n2 + n;
            n = sum / 10;

            ListNode p = new ListNode(sum % 10);
            p.next = cur.next;
            cur.next = p;
        }
        if (stack1.isEmpty()){
            while (!stack2.isEmpty()){
                sum = stack2.pop().val + n;
                n = sum / 10;

                ListNode p = new ListNode(sum % 10);
                p.next = cur.next;
                cur.next = p;
            }
        }
        if (stack2.isEmpty()){
            while (!stack1.isEmpty()){
                sum = stack1.pop().val + n;
                n = sum / 10;

                ListNode p = new ListNode(sum % 10);
                p.next = cur.next;
                cur.next = p;
            }
        }
        if (n != 0){
            ListNode p = new ListNode(n);
            p.next = cur.next;
            cur.next = p;
        }

        return firstHead.next;
    }




//    以下的方法只能在int范围内使用，超过范围会出现问题，故不用这个思想
    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        ListNode p1 = l1, p2 = l2;
        int count1 = 0,count2 = 0,n1 = 0,n2 = 0;
        if (p1 == null && p2 == null){
            ListNode rn = new ListNode(0);
            return rn;
        }
        if (p1 == null){
            return p2;
        }
        if (p2 == null){
            return p1;
        }
        while (p1 != null){
            count1++;
            n1 = n1 * 10;
            n1 += p1.val;
            p1 = p1.next;
        }
        while (p2 != null){
            count2++;
            n2 = n2 * 10;
            n2 += p2.val;
            p2 = p2.next;
        }
        int sum = n1 + n2;
        if (sum == 0){
            ListNode rn = new ListNode(0);
            return rn;
        }
        ListNode firstHead = new ListNode(-101);
        firstHead.next = null;
        ListNode cur = firstHead,p = firstHead;
        while (sum > 0){
            p = new ListNode( sum % 10);
            p.next = cur.next;
            cur.next = p;
            sum = sum / 10;
        }
        return firstHead.next;
    }
}
