package TopInterview;

import java.util.LinkedList;
import java.util.List;

public class TopInterview131 {
    List<List<String>> res = new LinkedList<>();
    int len;
    String s;
    List<String> list = new LinkedList<>();
    public List<List<String>> partition(String s) {
        this.len = s.length();
        this.s = s;
        List<String> list = new LinkedList<>();
        back(0);
        return res;
    }

    public void back(int index){
        if (index == len){
            res.add(new LinkedList<>(list));
            return;
        }
        for (int i = index; i < len; i++) {
            if (search(index, i)){
                list.add(s.substring(index, i + 1));
                back(i + 1);
                list.remove(list.size() - 1);
            }
        }
    }

    public boolean search(int left, int right){
        while (left < right){
            if (s.charAt(left) != s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}
