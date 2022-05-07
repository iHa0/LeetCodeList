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
        Map<Node, Node> map = new HashMap<>();
        Node p = head;
        while (p != null) {
            Node q = new Node(p.val);
            map.put(p, q);
            p = p.next;
        }
        p = head;
        while (p != null) {
            Node q = map.get(p);
            if (p.next != null) q.next = map.get(p.next);
            if (p.random != null) q.random = map.get(p.random);
            p = p.next;
        }
        return map.get(head);
    }
}
