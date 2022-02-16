package Top100Review;

public class Lc21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(-1);
        ListNode pre = head;
        while (list1 != null && list2 != null){
            if (list1.val <= list2.val){
                pre.next = list1;
                list1 = list1.next;
            } else {
                pre.next = list2;
                list2 = list2.next;
            }
            pre = pre.next;
        }
        pre.next = list1 == null ? list2 : list1;
        return head.next;
    }
}
