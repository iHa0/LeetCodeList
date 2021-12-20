package TopInterview;

public class TopInterview21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode l1 = list1;
        ListNode l2 = list2;
        ListNode head = new ListNode(-1);
        ListNode p = head;
        while (l1 != null && l2 != null){
            if (l1.val > l2.val){
                p.next = l2;
                p = p.next;
                l2 = l2.next;
            }else {
                p.next = l1;
                p = p.next;
                l1 = l1.next;
            }
        }
        if (l1 != null){
            p.next = l1;
        }
        if (l2 != null){
            p.next = l2;
        }
        return head.next;
    }
}
