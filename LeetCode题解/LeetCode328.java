public class LeetCode328 {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null){
            return head;
        }
        ListNode head2 = head.next,p1,p2;
        if (head2.next.next == null && head2.next != null){
            p1 = head.next.next;
            head.next = p1;
            p1.next = head2;
            head2.next = null;
            return head;
        }
        p1 = head.next.next;
        p2 = head2.next.next;
        head.next = p1;
        head2.next = p2;
        while (p1 != null && p2 != null){
            if (p1.next.next != null){
                p1.next = p1.next.next;
                p1 = p1.next;
            }
            if (p2.next == null)
                break;
            if (p2.next.next != null){
                p2.next = p2.next.next;
                p2 = p2.next;
            }else {
                p2.next = null;
                p2 = p2.next;
            }
        }
        p1.next = head2;
        return head;
    }
}
