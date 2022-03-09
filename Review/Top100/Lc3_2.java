import java.util.HashMap;

public class LeetCode3 {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        int left = 0, right = 0;
        int ans = 0;
        while (right < len) {
            char a = s.charAt(right);
            right++;
            hashMap.put(a, hashMap.getOrDefault(a, 0) + 1);
            while (hashMap.get(a) > 1){
                char b = s.charAt(left);
                left++;
                hashMap.put(b, hashMap.get(b) - 1);
            }
            ans = Math.max(ans, right - left);
        }
        return ans;
    }
}
