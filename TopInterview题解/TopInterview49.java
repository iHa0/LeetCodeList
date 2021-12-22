package TopInterview;

import java.util.*;

public class TopInterview49 {
    List<List<String>> res = new LinkedList<>();
    public List<List<String>> groupAnagrams(String[] strs) {
        int len = strs.length;
        HashMap<String, List<String>> hashMap = new HashMap<>();
        for (int i = 0; i < len; i++) {
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String s = new String(ch);
            List<String> list = hashMap.getOrDefault(s, new ArrayList<String>());
            list.add(strs[i]);
            hashMap.put(s, list);
        }
        return new ArrayList<List<String>>(hashMap.values());
    }
}
