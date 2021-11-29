package Top100;

import java.util.ArrayList;

public class Top155 {
    ArrayList<Integer> arrayList;
    int count;
    public Top155() {
        arrayList = new ArrayList<>();
        this.count = 0;
    }

    public void push(int val) {
        arrayList.add(val);
        count++;
    }

    public void pop() {
        arrayList.remove(count - 1);
        count--;
    }

    public int top() {
        int res = arrayList.get(count - 1);
        return res;
    }

    public int getMin() {
        int min = Integer.MAX_VALUE;
        for (int a:
             arrayList) {
            if (a < min){
                min = a;
            }
        }
        return min;
    }
}
