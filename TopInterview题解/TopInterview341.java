package TopInterview;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class TopInterview341 implements Iterator<Integer>{

    private LinkedList<Integer> ans;
    public TopInterview341(List<NestedInteger> nestedList) {
        ans = new LinkedList<>();
        DFS(nestedList);
    }

    @Override
    public Integer next() {
        return ans.removeFirst();
    }

    @Override
    public boolean hasNext() {
        return !ans.isEmpty();
    }

    public void DFS(List<NestedInteger> nestedIntegers){
        for (NestedInteger n : nestedIntegers) {
            if (n.isInteger()){
                ans.addLast(n.getInteger());
            } else {
                DFS(n.getList());
            }
        }
    }
}
