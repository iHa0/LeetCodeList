package TopInterview;

public class TopInterview148 {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null && slow != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode head2 = slow.next;
        slow.next = null;
        return merge(sortList(head), sortList(head2));
    }

    public ListNode merge(ListNode slow, ListNode fast){
        ListNode head = new ListNode(0);
        ListNode p = head;
        while (slow != null && fast != null){
            if (slow.val > fast.val){
                p.next = fast;
                fast = fast.next;
                p = p.next;
            }else {
                p.next = slow;
                slow = slow.next;
                p = p.next;
            }
        }
        if (slow == null || fast == null){
            if (slow == null){
                p.next = fast;
            }
            if (fast == null){
                p.next = slow;
            }
        }
        return head.next;
    }
}
