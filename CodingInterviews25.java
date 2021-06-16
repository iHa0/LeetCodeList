class CodingInterviews25 {
    
     public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1),current = head;
        while (l1 != null && l2 != null){
            if (l1.val > l2.val){
                ListNode tail = new ListNode(l2.val);

                current.next = tail;
                current = current.next;

                l2 = l2.next;
            }else {
                ListNode tail = new ListNode(l1.val);

                current.next = tail;
                current = current.next;

                l1 = l1.next;
            }

        }
        if (l1 == null){
            current.next = l2;
        }else {
            current.next = l1;
        }
        return head.next;
    }
}
