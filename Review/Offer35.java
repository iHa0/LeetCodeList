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
        Node p1 = head;
        while (p1 != null) {
            Node q = new Node(p1.val);
            map.put(p1, q);
            p1 = p1.next;
        }
        for (Node p : map.keySet()) {
            if (p.random != null) map.get(p).random = map.get(p.random);
            if (p.next != null) map.get(p).next = map.get(p.next);
        }
        return map.get(head);
    }
}
