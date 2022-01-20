package TopInterview;

import java.util.HashMap;

public class TopInterview340 {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int len = s.length();
        int max = 0, count = 0;
        int left = 0, right = 0;
        HashMap<Character, Integer> hashMap = new HashMap<>();
        while (right < len){
            char a = s.charAt(right);
            right++;
            if (hashMap.size() <= k && hashMap.containsKey(a)){
                count++;
                hashMap.put(a, hashMap.get(a) + 1);
                max = Math.max(max, count);
            }else if (hashMap.size() < k && !hashMap.containsKey(a)){
                hashMap.put(a, hashMap.getOrDefault(a , 0) + 1);
                count++;
                max = Math.max(max, count);
            }else if (!hashMap.containsKey(a)){
                hashMap.put(a, hashMap.getOrDefault(a , 0) + 1);
                count++;
            }
            while (hashMap.size() > k){
                char b = s.charAt(left);
                left++;
                hashMap.put(b, hashMap.get(b) - 1);
                if (hashMap.get(b) == 0)
                    hashMap.remove(b);
                count--;
            }
        }
        return max;
    }
}
