package Review;

import java.util.HashMap;

public class LeetCode395 {
    public int longestSubstring(String s, int k) {
        if (s.length() < k)
            return 0;
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char a : s.toCharArray()) {
            hashMap.put(a, hashMap.getOrDefault(a, 0) + 1);
        }
        for (char a : hashMap.keySet()) {
            if (hashMap.get(a) < k){
                int res = 0;
                for (String ss : s.split(String.valueOf(a))) {
                    res = Math.max(res, longestSubstring(ss, k));
                }
                return res;
            }
        }
        return s.length();
    }
}
