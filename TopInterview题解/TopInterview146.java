package TopInterview;

import java.util.HashMap;

class LRUCache {
    class Node{
        private int x, y;
        private Node pre, next;
        public Node(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    class DoubleList{
        private int size;
        private Node head, tail;
        public DoubleList(){
            head = new Node(0, 0);
            tail = new Node(0, 0);
            head.next = tail;
            tail.pre = head;
            size = 0;
        }
        public void addNew(Node x){
            x.next = tail;
            x.pre = tail.pre;
            tail.pre.next = x;
            tail.pre = x;
            size++;
        }
        public void remove(Node x){
            x.pre.next = x.next;
            x.next.pre = x.pre;
            size--;
        }

        public Node removeFirst(){
            if (head.next == tail)
                return null;
            Node first = head.next;
            remove(first);
            return first;
        }
        public int getSize(){
            return size;
        }
    }
    private int cap;
    private DoubleList doubleList;
    private HashMap<Integer, Node> hashMap;
    public LRUCache(int capacity) {
        this.cap = capacity;
        this.doubleList = new DoubleList();
        this.hashMap = new HashMap<>();
    }
    public void addRecent(int key){
        Node x = hashMap.get(key);
        doubleList.remove(x);
        doubleList.addNew(x);
    }
    public void addNew(int key, int val){
        Node nodeNew = new Node(key, val);
        doubleList.addNew(nodeNew);
        hashMap.put(key, nodeNew);
    }
    public void remove(int key){
        Node rem = hashMap.get(key);
        doubleList.remove(rem);
        hashMap.remove(key);
    }
    public void removeFirst(){
        Node first = doubleList.removeFirst();
        hashMap.remove(first.x);
    }

    public int get(int key) {
        if (!hashMap.containsKey(key))
            return -1;
        int res = hashMap.get(key).y;
        addRecent(key);
        return res;
    }

    public void put(int key, int value) {
        if (hashMap.containsKey(key)){
            remove(key);
            addNew(key, value);
            return;
        }
        if (doubleList.getSize() >= cap)
            removeFirst();
        addNew(key, value);
    }
}
