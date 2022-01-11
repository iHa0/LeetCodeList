package TopInterview;

public class TopInterview237 {
    public void deleteNode(ListNode node) {
        int temp = node.next.val;
        node.val = temp;
        node.next = node.next.next;
    }
}
