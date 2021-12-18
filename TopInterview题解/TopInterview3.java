package TopInterview;

import java.util.HashMap;

public class TopInterview3 {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        if (len == 0)
            return 0;
        HashMap<Character, Integer> hashMap = new HashMap<>();
        int left = 0, right = 0, max = Integer.MIN_VALUE, value = 0;
        while (right < len){
            char a = s.charAt(right);
            right++;
            hashMap.put(a, hashMap.getOrDefault(a, 0) + 1);
            while (hashMap.get(a) > 1){
                char b = s.charAt(left);
                left++;
                hashMap.put(b, hashMap.get(b) - 1);
            }
            int temp = right - left;
            max = Math.max(max, temp);
        }
        return max;
    }
}
