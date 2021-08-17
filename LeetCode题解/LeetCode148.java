public class LeetCode148 {


    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        int len = 0;
        ListNode p = head;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        while (p != null){
            len++;
            arrayList.add(p.val);
            p = p.next;
        }
        Collections.sort(arrayList);
        len = 0;
        p = head;
        while (p != null){
            p.val = arrayList.get(len++);
            p = p.next;
        }
        return head;
    }
}
