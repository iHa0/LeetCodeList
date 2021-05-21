public class LeetCode143 {
    public void reorderList(ListNode head) {
        ListNode p = head;
        Stack<ListNode> stack = new Stack<ListNode>();
        Queue<ListNode> queue = new LinkedList<ListNode>();
        int len = 0,lenNew = 0;
        while (p != null){
            stack.add(p);
            queue.add(p);
            p = p.next;
            len ++;
        }
        queue.poll();
        len = len - 1;
        p = head;
        while (lenNew < len){
            if (lenNew < len){
                p.next = stack.pop();
                p = p.next;
                lenNew ++;
            }
            if (lenNew < len){
                p.next = queue.poll();
                p = p.next;
                lenNew ++;
            }
        }
        p.next = null;
    }
}
