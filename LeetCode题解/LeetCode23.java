public class LeetCode23 {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode firstHead = new ListNode(-101);
        if (lists.length == 0 || lists == null){
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int count = 0;
        for (int i = 0 ; i < lists.length ; i++){
            while (lists[i] != null){
                arrayList.add(lists[i].val);
                count++;
                lists[i] = lists[i].next;
            }
        }
        Collections.sort(arrayList);
        ListNode p = firstHead;
        for (int j = 0 ; j < count ; j++){
            p.next = new ListNode(arrayList.get(j));
            p = p.next;
        }
        p.next = null;
        return firstHead.next;
    }
}
