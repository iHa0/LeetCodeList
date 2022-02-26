import java.util.*;

public class Lc49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hashMap = new HashMap<>();
        for (String a : strs) {
            char[] chars = a.toCharArray();
            Arrays.sort(chars);
            String s = new String(chars);
            List<String> temp = hashMap.getOrDefault(s, new ArrayList<>());
            temp.add(a);
            hashMap.put(s, temp);
        }
        return new ArrayList<List<String>>(hashMap.values());
    }
}
