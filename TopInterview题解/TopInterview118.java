package TopInterview;

import java.util.LinkedList;
import java.util.List;

public class TopInterview118 {
    List<List<Integer>> res;
    public List<List<Integer>> generate(int numRows) {
        this.res = new LinkedList<>();
        if (numRows == 0)
            return res;
        List<Integer> list = new LinkedList<>();
        list.add(1);
        res.add(list);
        if (numRows == 1)
            return res;
        list = new LinkedList<>();
        list.add(1);
        list.add(1);
        res.add(list);
        if (numRows == 2)
            return res;
        for (int i = 2; i < numRows; i++) {
            list = new LinkedList<>();
            list.add(1);
            List<Integer> temp = res.get(i - 1);
            for (int j = 0; j < i - 1; j++) {
                list.add(temp.get(j) + temp.get(j + 1));
            }
            list.add(1);
            res.add(list);
        }
        return res;
    }
}
