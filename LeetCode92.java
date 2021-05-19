public class LeetCode92 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right || head == null || head.next == null){
            return head;
        }
        Stack<ListNode> stack = new Stack<ListNode>();
        ListNode firstHead = new ListNode(-101);
        firstHead.next = head;
        ListNode cur = firstHead , p = firstHead , pt = firstHead;
        int gap = right - left;
        while (left-- > 1){
            p = p.next;
            cur = cur.next;
        }
        p = p.next;

        while (gap-- >= 0){
            pt = p.next;
            stack.add(p);
            p = pt;
        }
        while (!stack.isEmpty()){
            cur.next = stack.pop();
            cur = cur.next;
        }
        cur.next = p;


        return firstHead.next;
    }
}
