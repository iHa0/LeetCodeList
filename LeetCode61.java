import javafx.scene.control.skin.SliderSkin;

import java.util.Stack;

public class LeetCode61 {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null)
            return null;
        ListNode countP = head;
        int count = 0;
        while (countP != null){
            count++ ;
            countP = countP.next;
        }
        System.out.println(count);
        int dk = k % count;
        System.out.println(dk);
        Stack<ListNode> stack = new Stack<ListNode>();
        ListNode tail = head , cur = head;
        for (int i = 0 ; i < dk ; i++){
            tail = tail.next;
        }
        System.out.println(tail.val);
        while (tail.next != null){
            tail = tail.next;
            cur = cur.next;
        }
        ListNode p = cur.next;
        cur.next = null;
        while (p != null){
            cur = p;
            p = p.next;
            stack.add(cur);
        }
        ListNode newHead = new ListNode(-1);
        ListNode newCur = newHead;
        while (!stack.isEmpty()){
            newCur.next = stack.pop();
        }
        ListNode tailP = newHead;
        while (tailP.next != null){
            tailP = tailP.next;
        }
        tailP.next = head;
        return newHead.next;

    }
}
