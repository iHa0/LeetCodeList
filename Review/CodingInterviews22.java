package TopInterview;

public class CodingInterviews22_2 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        if (k == 0)
            return head;
        if (head.next == null)
            return head;
        ListNode p = head;
        for (int i = 0; i < k; i++) {
            p = p.next;
        }
        ListNode headindex = head;
        while (p != null){
            p = p.next;
            headindex = headindex.next;
        }
        return headindex;
    }
}
