package Top100;

public class Top148_2 {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode slow = head, fast = head.next;
        while (slow != null && fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode head2 = slow.next;
        slow.next = null;
        return merge(sortList(head), sortList(head2));
    }
    public ListNode merge(ListNode l1, ListNode l2){
        ListNode head = new ListNode(0);
        ListNode p = l1, q = l2, temp = head;
        while (p != null && q != null){
            if (p.val > q.val){
                temp.next = q;
                temp = temp.next;
                q = q.next;
            }else {
                temp.next = p;
                temp = temp.next;
                p = p.next;
            }
        }
        if (p == null || q == null){
            if (p == null){
                temp.next = q;
            }
            if (q == null){
                temp.next = p;
            }
        }
        return head.next;
    }
}
