package TopInterview;

public class TopInterview234 {
    public boolean isPalindrome(ListNode head) {
        if (head.next == null)
            return true;
        if (head.next.next == null)
            return head.next.val == head.val;
        ListNode left = head, right = head.next, tempLeft = head;
        while (right.next != null && right.next.next != null){
            left = left.next;
            right = right.next.next;
        }
        if (right.next != null){
            tempLeft = left.next.next;
        }else {
            tempLeft = left.next;
        }
        left.next = null;
        ListNode leftHead = new ListNode(-1);
        ListNode p = leftHead.next;
        while (tempLeft != null){
            leftHead.next = tempLeft;
            tempLeft = tempLeft.next;
            leftHead.next.next = p;
            p = leftHead.next;
        }
        ListNode q = leftHead.next;
        while (head != null && q != null){
            if (head.val != q.val)
                return false;
            head = head.next;
            q = q.next;
        }
        return true;
    }
}
