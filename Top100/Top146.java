package Top100;

import java.util.*;

class LRUCache {
    class Node{
        public int key, val;
        public Node next, prev;
        public Node(int k, int v){
            this.key = k;
            this.val = v;
        }
    }
    class DoubleList{
        private Node head, tail;
        private int size;
        public DoubleList(){
            head = new Node(0, 0);
            tail = new Node(0,0);
            head.next = tail;
            tail.prev = head;
            size = 0;
        }
        // 在链表尾部增加结点
        public void addLast(Node x){
            x.prev = tail.prev;
            x.next = tail;
            tail.prev.next = x;
            tail.prev = x;
            size++;
        }
        // 删除链表结点
        public void remove(Node x){
            x.prev.next = x.next;
            x.next.prev = x.prev;
            size--;
        }
        // 删除链表第一个结点
        public Node removeFirst(){
            if (head.next == tail)
                return null;
            Node first = head.next;
            remove(first);
            return first;
        }
        // 返回链表长度
        public int getSize(){
            return size;
        }
    }

    private HashMap<Integer, Node> map;
    private DoubleList doubleList;
    private int cap;
    public LRUCache(int capacity) {
        this.map = new HashMap<>();
        this.doubleList = new DoubleList();
        this.cap = capacity;
    }

    // 将某个结点提升为最近使用的，即添加到双链表尾部
    private void makeRecently(int key){
        Node recently = map.get(key);
        doubleList.remove(recently);
        doubleList.addLast(recently);
    }

    // 添加最近使用的元素
    private void putRecently(int key, int val){
        Node recently = new Node(key, val);
        doubleList.addLast(recently);
        map.put(key, recently);
    }

    // 删除某一个 Key
    private void delectKey(int key){
        Node delect = map.get(key);
        doubleList.remove(delect);
        map.remove(key);
    }

    // 删除最久未使用的元素
    private void removeLeastRecently(){
        Node delectLeast = doubleList.removeFirst();
        int delectKey = delectLeast.key;
        map.remove(delectKey);
    }

    public int get(int key) {
        if (!map.containsKey(key))
            return -1;
        makeRecently(key);
        return map.get(key).val;
    }

    public void put(int key, int value) {
        //删除旧数据，同时添加
        if (map.containsKey(key)){
            delectKey(key);
            putRecently(key, value);
            return;
        }
        if (doubleList.getSize() < cap){
            putRecently(key, value);
        }else {
            // 说明容量不够了
            removeLeastRecently();
            putRecently(key, value);
        }
    }
}
