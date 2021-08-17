import java.util.Stack;

public class Leetcode24 {
    public ListNode swapPairs(ListNode head) {
        ListNode pre = new ListNode(-1);
        pre.next = head;
        ListNode temp = pre;
        while (temp.next != null && temp.next.next != null){
            ListNode start = temp.next;
            ListNode end = temp.next.next;
            temp.next = end;
            start.next = end.next;
            end.next = start;
            temp = start;
        }
        return pre.next;
    }


    public ListNode swapPairs2(ListNode head){
        if (head == null || head.next == null){
            return  head;
        }
        Stack<ListNode> stack = new Stack<ListNode>();
        ListNode pre = new ListNode(-1);
        ListNode cur = head;
        head = pre;
        while (cur != null && cur.next != null){
            stack.add(cur);
            stack.add(cur.next);
            cur = cur.next.next;
            pre.next = stack.pop();
            pre = pre.next;
            pre.next = stack.pop();
            pre = pre.next;
        }


        if (cur != null){
            pre.next = cur;
        }else {
            pre.next = null;
        }

        return head.next;
    }
}
