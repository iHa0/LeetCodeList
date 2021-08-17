class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode p = head;
        int count = 0 , i , j , k;
        List<Integer> list = new ArrayList<Integer>();
        while (p != null){
            count++;
            list.add(p.val);
            p = p.next;
        }
        for (i = 0 , j = count-1 ; i <= j ; i++ , j--){
            if (list.get(i) != list.get(j))
                return false;
        }
        return true;
    }
}
