package Top100Review;

import java.util.HashMap;

public class Lc3 {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        int left = 0, right = 0;
        int max = 0;
        HashMap<Character, Integer> hashMap = new HashMap<>();
        while (right < len){
            char a = s.charAt(right);
            right++;
            hashMap.put(a, hashMap.getOrDefault(a, 0) + 1);
            while (hashMap.get(a) > 1){
                char b = s.charAt(left);
                left++;
                hashMap.put(b, hashMap.get(b) - 1);
            }
            max = Math.max(max, (right - left));
        }
        return max;
    }
}
