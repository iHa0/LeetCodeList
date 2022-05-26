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
        Map<Node, Node> map = new HashMap<>();
        Node p = head;
        while (p != null) {
            Node q = new Node(p.val);
            map.put(p, q);
            p = p.next;
        }
        p = head;
        while (p != null) {
            if (p.random != null) map.get(p).random = map.get(p.random);
            if (p.next != null) map.get(p).next = map.get(p.next);
            p = p.next;
        }
        return map.get(head);
    }
}
