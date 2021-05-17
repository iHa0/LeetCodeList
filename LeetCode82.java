public class LeetCode82 {
    public ListNode deleteDuplicates(ListNode head) {
        // 特殊情况判断
        if(head == null || head.next == null) return head;
        // 设置虚拟头结点
        ListNode dummyHead = new ListNode(-101);
        dummyHead.next = head;
        //pre指针指向cur1指针的前一个节点
        ListNode pre = dummyHead;
        //cur1指针指向当前节点
        ListNode cur1 = head;
        //cur2指针用来遍历
        ListNode cur2 = head;
        //记录数字出现的次数
        int count = 0;
        //cur2指针用来遍历
        while(cur2 != null){
            //循环找下一个不同的元素
            while(cur2 != null && cur1.val == cur2.val){
                cur2 = cur2.next;
                count++;
            }
            //如果次数为1，则不用删，pre和cur1向后移动一次
            if(count == 1){
                cur1 = cur1.next;
                pre = pre.next;
            }
            //否则讲pre的下一个节点指向cur2，并让cur1指向cur2
            else{
                pre.next = cur2;
                cur1 = cur2;
            }
            //次数还原
            count = 0;
        }
        return dummyHead.next;
    }
    //方法二还需要优化，明天完成
    public ListNode deleteDuplicates2(ListNode head) {
        int flag ,temp = -200,nextVal;
        ListNode cur = head , pre = head , p = head;
        if (head == null){
            return null;
        }
        if (head.next == null){
            return head;
        }
        if (head.next!=null && head.next.next== null){
            if (head.next.val == head.val){
                return null;
            }
        }
        p = p.next;
        if (p.next == null){
            nextVal = -200;
        }else {
            nextVal = p.val;
        }

        if (head.val == nextVal){
            flag = 1;
        }else {
            flag = 0;
        }
//        System.out.println(flag);
        while ( p != null ){
            if (flag == 1){
                if (cur.val != p.val){
                    flag = 0;
                    head = p.next;
                    continue;
//                    head = p;
                }
                head = p;
                p = p.next;


                cur = head;
            }else {
                if (p.val == temp){
                    if (p.next == null){
                        cur.next = null;
                    }
                    p = p.next;
                    continue;
                }
                if (p.next == null){
                    nextVal = -200;
                }else {
                    nextVal = p.next.val;
                }
                if (cur.val != p.val && p.val != nextVal) {
                    cur.next = p;
                    cur = p;
                    p = p.next;
                }else if (cur.val != p.val && p.val == nextVal){
                    temp = p.val;
                    p = p.next;
                }
            }

        }
        return head;
    }
}
