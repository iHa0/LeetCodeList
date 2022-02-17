import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Offer38 {
    int len;
    char[] chars;
    boolean used[];
    List<String> temp = new ArrayList<>();
    public String[] permutation(String s) {
        this.chars = s.toCharArray();
        Arrays.sort(this.chars);
        this.len = s.length();
        this.used = new boolean[len];
        LinkedList<Character> list = new LinkedList<>();
        dfs(list);
        String[] res = temp.toArray(new String[temp.size()]);
        return res;
    }

    private void dfs(LinkedList<Character> list) {
        if (list.size() == len){
            StringBuilder sb = new StringBuilder();
            for (char t : list) {
                sb.append(t);
            }
            temp.add(sb.toString());
            return;
        }
        for (int i = 0; i < len; i++) {
            if (used[i])
                continue;
            if (i > 0 && chars[i] == chars[i - 1] && !used[i - 1])
                continue;
            list.add(chars[i]);
            used[i] = true;
            dfs(list);
            list.removeLast();
            used[i] = false;
        }
    }
}
