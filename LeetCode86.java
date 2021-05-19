public class LeetCode86 {
    public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode firstHead = new ListNode(-101);
        firstHead.next = head;
        ListNode cur = firstHead,pre = firstHead,p = firstHead.next,pt = firstHead;
        while (p != null){
            //当都是连续小于x或者大于等于x的情况下直接移动到下一个位置即可
            if (pre.val < x && p.val < x){
                p = p.next;
                cur = cur.next;
                pre = pre.next;
                continue;
            }
            if (pre.val >= x && p.val >= x){
                p = p.next;
                pre = pre.next;
                continue;
            }
            if (pre.val < x && p.val >= x){
                p = p.next;
                pre = pre.next;
                continue;
            }
            if (pre.val >= x && p.val < x){
                pt = p.next;
                p.next = cur.next;
                cur.next = p;

                cur = cur.next;
                pre.next = pt;
                p = pt;
                continue;
            }

        }
        return firstHead.next;
    }
}
