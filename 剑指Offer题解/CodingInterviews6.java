import java.util.Stack;

public class CodingInterviews6 {
    public int[] reversePrint(ListNode head) {
        if (head == null){
            int[] a = {};
            return a;
        }
        Stack<Integer> stack = new Stack<>();
        ListNode p = head;
        while (p != null){
            stack.add(p.val);
            p = p.next;
        }
        int n = 0;
        int[] res = new int[stack.size()];
        while (!stack.isEmpty()){
            res[n++] = stack.pop();
        }
        return res;
    }
}
