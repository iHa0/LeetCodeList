import java.util.ArrayList;
import java.util.Collections;

public class LeetCode23 {
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int len = lists.length;
        for (ListNode a : lists) {
            while (a != null){
                arrayList.add(a.val);
                a = a.next;
            }
        }
        Collections.sort(arrayList);
        ListNode head = new ListNode(-1);
        ListNode p = head;
        for (Integer n : arrayList) {
            p.next = new ListNode(n);
            p = p.next;
        }
        return head.next;
    }
}
