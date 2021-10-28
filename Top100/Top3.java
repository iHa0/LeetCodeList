import java.util.HashMap;

public class Top3_2 {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0, res = 0;
        HashMap<Character, Integer> hashMap = new HashMap<>();
        while (right < s.length()){
            char a = s.charAt(right);
            right++;
            hashMap.put(a, hashMap.getOrDefault(a, 0) + 1);
            while (hashMap.get(a) > 1){
                char b = s.charAt(left);
                left++;
                hashMap.put(b, hashMap.getOrDefault(b, 0) - 1);
            }
            res = Math.max(res, right - left);
        }
        return res;
    }
}
