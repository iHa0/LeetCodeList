package Top100;

public class Top234_2 {
    public boolean isPalindrome(ListNode head) {
        if (head.next == null)
            return true;
        ListNode left = head, right = head.next, temp = head.next;
        ListNode newHead = new ListNode(0);
        left.next = null;
        while (right != null && right.next != null){
            if (right.next.next == null){
                temp = temp.next;
                break;
            }
            right = right.next.next;
            ListNode tempNext = temp.next;
            temp.next = left;
            left = temp;
            temp = tempNext;
        }
        ListNode p = left, q = temp;
        while (p != null && q != null){
            if (p.val == q.val){
                p = p.next;
                q = q.next;
            }else {
                return false;
            }
        }
        return true;
    }
}
