package TopInterview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TopInterview23 {
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int len = lists.length;
        for (int i = 0; i < len; i++) {
            ListNode p = lists[i];
            while (p != null){
                arrayList.add(p.val);;
                p = p.next;
            }
        }
        Collections.sort(arrayList);
        ListNode head = new ListNode(-1);
        ListNode p = head;
        for (int i = 0; i < arrayList.size(); i++) {
            p.next = new ListNode(arrayList.get(i));
            p = p.next;
        }
        return head.next;
    }
}
