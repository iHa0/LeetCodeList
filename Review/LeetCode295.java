class MedianFinder {

    PriorityQueue<Integer> small, big;

    public MedianFinder() {
        small = new PriorityQueue<>();
        big = new PriorityQueue<>((o1, o2) -> o2 - o1);
    }
    
    public void addNum(int num) {
        int m = small.size(), n = big.size();
        if (m == n) {
            big.add(num);
            small.add(big.poll());
        } else {
            small.add(num);
            big.add(small.poll());
        }
    }
    
    public double findMedian() {
        int m = small.size(), n = big.size();
        return (m + n) % 2 == 0 ? (small.peek() + big.peek()) / 2.0 : (double)small.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
