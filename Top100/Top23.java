import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Top23 {
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < lists.length; i++) {
            ListNode p = lists[i];
            while (p != null){
                arrayList.add(p.val);
                p = p.next;
            }
        }
        Collections.sort(arrayList);
        ListNode head = new ListNode(0);
        ListNode q = head;
        for (int i = 0; i < arrayList.size(); i++) {
            q.next = new ListNode(arrayList.get(i));
            q = q.next;
        }
        return head.next;
    }
}
