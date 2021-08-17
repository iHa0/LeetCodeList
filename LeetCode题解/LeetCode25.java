public class LeetCode25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k == 1 || head == null || head.next == null){
            return head;
        }
        ListNode firstHead = new ListNode(-101);
        firstHead.next = head;
        ListNode pre = firstHead,cur = firstHead.next,p = cur.next;
        int count = 0;
        while (cur != null){
            count++;
            cur = cur.next;
        }
        cur = pre.next;
        for (int i = 0;i < count/k;i++){
            for (int j = 0 ; j < k - 1 ; j++){
                p = cur.next;
                cur.next = p.next;
                p.next = pre.next;
                pre.next = p;
            }
            pre = cur;
            cur = pre.next;
        }
        return firstHead.next;
    }
}
