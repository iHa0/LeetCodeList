public class ListNodeTest {
    private static ListNode createLinkedList(int[] arr) {// 将输入的数组输入到链表中
        if (arr.length == 0) {
            return null;
        }
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        for (int i = 1; i < arr.length; i++) {// 过程
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        return head;
    }

    private static void printLinkedList(ListNode head) {// 将链表结果打印
        ListNode current = head;
        while (current != null) {
            System.out.printf("%d -> ", current.val);
            current = current.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        int[] x = { 1, 2, 3, 4, 5, 6 };
        Leetcode24 leetcode24 = new Leetcode24();
        ListNode list = createLinkedList(x);
        printLinkedList(leetcode24.swapPairs(list));
    }

}
