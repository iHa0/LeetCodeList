package TopInterview;

import java.util.PriorityQueue;

public class TopInterview295 {
    PriorityQueue<Integer> l = new PriorityQueue<>((o1, o2) -> o2 - o1);
    PriorityQueue<Integer> r = new PriorityQueue<>((o1, o2) -> o1 - o2);
    public TopInterview295() {
    }

    public void addNum(int num) {
        int s1 = l.size(), s2 = r.size();
        if (s1 == s2){
            if (r.isEmpty() || num <= r.peek()){
                l.add(num);
            }else {
                l.add(r.poll());
                r.add(num);
            }
        }else {
            if (l.peek() <= num){
                r.add(num);
            }else {
                r.add(l.poll());
                l.add(num);
            }
        }
    }

    public double findMedian() {
        int s1 = l.size(), s2 = r.size();
        if (s1 == s2){
            return (l.peek() + r.peek()) / 2.0;
        }else {
            return l.peek();
        }
    }
}
