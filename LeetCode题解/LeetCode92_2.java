import java.util.List;

public class LeetCode92 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode l = head, r = head;
        ListNode pre = dummy, next = dummy;
        for (int i = 0; i < left - 1 && l != null; i++) {
            l = l.next;
            pre = pre.next;
        }
        for (int i = 0; i < right - 1 && r != null; i++) {
            r = r.next;
        }
        next = r.next;
        r.next = null;
        pre.next = reverse(l);
        l.next = next;
        return dummy.next;
    }

    private ListNode reverse(ListNode l) {
        if (l == null || l.next == null)
            return l;
        ListNode cur = reverse(l.next);
        l.next.next = l;
        l.next = null;
        return cur;
    }
}
