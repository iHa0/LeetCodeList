package TopInterview;

import java.util.HashMap;

public class TopInterview395 {
    public int longestSubstring(String s, int k) {
        if (s.length() < k)
            return 0;
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            hashMap.put(s.charAt(i), hashMap.getOrDefault(s.charAt(i), 0 ) + 1);
        }
        for (char ch : hashMap.keySet()) {
            if (hashMap.get(ch) < k){
                int res = 0;
                for (String ss : s.split(String.valueOf(ch))) {
                    res = Math.max(res, longestSubstring(s, k));
                }
                return res;
            }
        }
        return s.length();
    }
}
