import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class CodingInterviews30 {
    /** initialize your data structure here. */
    Deque<Integer> res;
    Deque<Integer> min;
    public CodingInterviews30() {
        res = new LinkedList<>();
        min = new LinkedList<>();
        min.push(Integer.MAX_VALUE);
    }

    public void push(int x) {
        res.push(x);
        min.push(Math.min(min.peek(), x));

    }

    public void pop() {
        res.pop();
        min.pop();
    }

    public int top() {
        return res.peek();
    }

    public int min() {
        return min.peek();
    }
}
