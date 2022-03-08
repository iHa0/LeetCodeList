package Top100;

import java.util.HashMap;

public class LRUCache {
    class Node{
        private int key, value;
        private Node pre, next;
        Node(int key, int value){
            this.key = key;
            this.value = value;
        }
    }

    class DoubleList {
        private Node head, tail;
        private int size;
        public DoubleList() {
            this.head = new Node(0, 0);
            this.tail = new Node(0, 0);
            head.next = tail;
            tail.pre = head;
        }

        public int getSize() {
            return size;
        }

        public void addNew(Node x) {
            x.next = tail;
            x.pre = tail.pre;
            tail.pre.next = x;
            tail.pre = x;
            size++;
        }

        public void remove(Node x) {
            x.pre.next = x.next;
            x.next.pre = x.pre;
            size--;
        }

        public Node removeFirst() {
            Node first = head.next;
            remove(first);
            return first;
        }
    }

    private int cap;
    private DoubleList doubleList;
    private HashMap<Integer, Node> hashMap = new HashMap<>();

    public LRUCache(int capacity) {
        this.cap = capacity;
        this.doubleList = new DoubleList();
    }

    public void addRecent(int key) {
        Node x = hashMap.get(key);
        doubleList.remove(x);
        doubleList.addNew(x);
    }

    public void add(int key, int value) {
        Node x = new Node(key, value);
        doubleList.addNew(x);
        hashMap.put(key, x);
    }

    public void remove(int key) {
        Node x = hashMap.get(key);
        doubleList.remove(x);
        hashMap.remove(key);
    }

    public void removeFirst() {
        Node x = doubleList.removeFirst();
        hashMap.remove(x.key);
    }

    public int get(int key) {
        if (!hashMap.containsKey(key))
            return -1;
        addRecent(key);
        return hashMap.get(key).value;
    }

    public void put(int key, int value) {
        if (hashMap.containsKey(key)){
            remove(key);
            add(key, value);
            return;
        }
        if (doubleList.getSize() >= cap) {
            removeFirst();
        }
        add(key,value);
    }
}
