class MaxQueue {
    Deque<Integer> queue, max;

    public MaxQueue() {
        this.queue = new LinkedList<>();
        this.max = new LinkedList<>();
    }
    
    public int max_value() {
        if (max.isEmpty()) return -1;
        else return max.peekFirst();
    }
    
    public void push_back(int value) {
        queue.addLast(value);
        while (!max.isEmpty() && value > max.peekLast()) max.pollLast();
        max.addLast(value);
    }
    
    public int pop_front() {
        if (queue.isEmpty()) return -1;
        int res = queue.poll();
        if (max.peekFirst() == res) max.poll();
        return res;
    }
}

/**
 * Your MaxQueue object will be instantiated and called as such:
 * MaxQueue obj = new MaxQueue();
 * int param_1 = obj.max_value();
 * obj.push_back(value);
 * int param_3 = obj.pop_front();
 */
