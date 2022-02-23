import java.util.HashMap;

public class LRU_5 {
    class Node{
        private int key, value;
        private Node pre, next;
        Node(int key, int value){
            this.key = key;
            this.value = value;
        }
    }

    class DoubleList{
        private Node head, tail;
        private int size;
        DoubleList(){
            this.head = new Node(0, 0);
            this.tail = new Node(0, 0);
            head.next = tail;
            tail.pre = head;
        }

        public void addNew(Node x){
            x.next = tail;
            x.pre = tail.pre;
            tail.pre.next = x;
            tail.pre = x;
            size++;
        }

        public void remove(Node x){
            x.next.pre = x.pre;
            x.pre.next = x.next;
            size--;
        }

        public Node removeFirst(){
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
    HashMap<Integer, Node> hashMap = new HashMap<>();
    public LRU_5(int capacity) {
        this.cap = capacity;
        this.doubleList = new DoubleList();
    }

    public void addRecent(int key){
        Node temp = hashMap.get(key);
        doubleList.remove(temp);
        doubleList.addNew(temp);
    }

    public void add(int key, int val){
        Node x = new Node(key, val);
        doubleList.addNew(x);
        hashMap.put(key, x);
    }

    public void remove(int key){
        Node x = hashMap.get(key);
        doubleList.remove(x);
        hashMap.remove(key);
    }

    public void removeFirst(){
        Node first = doubleList.removeFirst();
        hashMap.remove(first.key);
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
        if (doubleList.getSize() >= cap)
            removeFirst();
        add(key, value);
    }
}
