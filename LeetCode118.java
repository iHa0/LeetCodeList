import java.util.ArrayList;
import java.util.List;

public class LeetCode118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> arrayList = new ArrayList();
        List<Integer> arrayList2 = new ArrayList();
        arrayList.add(1);
        res.add(arrayList);
        if (numRows == 1){
            return res;
        }
        arrayList2.add(1);
        arrayList2.add(1);
        res.add(arrayList2);
        if (numRows == 2){
            return res;
        }
        int count = 2;
        for (int i = 2; i < numRows; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i){
                    temp.add(1);
                    continue;
                }
                temp.add(arrayList2.get(j - 1) + arrayList2.get(j));
            }
            res.add(temp);
            arrayList2 = temp;
        }

        return res;
    }
}
