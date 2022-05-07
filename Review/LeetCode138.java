/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;
        Node p = head;
        while (p != null) {
            Node q = new Node(p.val);
            q.next = p.next;
            p.next = q;
            p = q.next;
        }
        Node a = head, b = head.next;
        while (a != null && b != null) {
            if (a.random != null) b.random = a.random.next;
            a = a.next.next;
            if (b.next != null) b = b.next.next;
        }
        a = head;
        b = head.next;
        Node res = b;
        while (a != null && b != null) {
            a.next = b.next;
            if (b.next != null) b.next = b.next.next;
            else {
                b.next = null;
                return res;
            }
            a = a.next;
            b = b.next;
        }
        return res;
    }
}
