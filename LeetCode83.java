public class LeetCode83 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode cur = head,p = head.next;
        while (p != null){
            if (cur.val == p.val){
                int x= cur.val;
                while (p!= null && p.val == x){
                    p = p.next;
                }
                cur.next = p;
            }else {
                cur = cur.next;
                p = p.next;
            }
        }
        return head;
    }
}
