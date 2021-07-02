import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode451 {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c :
                s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        List<Character>[] lists = new ArrayList[s.length() + 1];
        for (char c :
                map.keySet()) {
            int f = map.get(c);
            if (lists[f] == null)
                lists[f] = new ArrayList<>();
            lists[f].add(c);
        }
        StringBuilder str = new StringBuilder();
        for (int i = lists.length - 1; i >= 0; i--) {
            if (lists[i] == null)
                continue;
            for (char c : lists[i]) {
                // 在lists数组中，已经对出现的次数进行了划分，所以i可以代表每个单词出现的次数
                for (int j = 0; j < i; j++) {
                    str.append(c);
                }
            }
        }
        return str.toString();
    }
}
