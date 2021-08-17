import java.util.HashMap;
import java.util.HashSet;

public class LeetCodeOffer0201 {
    public ListNode removeDuplicateNodes(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode p = head.next,pre = head;
        HashSet<Integer> hashSet = new HashSet<Integer>();
        hashSet.add(pre.val);
        while (p != null){
            if (hashSet.contains(p.val)){
                pre.next = p.next;
                p = p.next;
            }else {
                hashSet.add(p.val);
                p = p.next;
                pre = pre.next;
            }
        }
        return head;
    }
}
