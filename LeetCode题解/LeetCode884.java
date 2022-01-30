package Review;

import java.util.ArrayList;
import java.util.HashMap;

public class LeetCode884 {
    public String[] uncommonFromSentences(String s1, String s2) {
        String ss = s1 + " " + s2;
        String[] a = ss.split(" ");
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String temp : a) {
            hashMap.put(temp, hashMap.getOrDefault(temp, 0) + 1);
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for (String key : hashMap.keySet()) {
            if (hashMap.get(key) == 1)
                arrayList.add(key);
        }
        String[] res = arrayList.toArray(new String[arrayList.size()]);
        return res;
    }
}
