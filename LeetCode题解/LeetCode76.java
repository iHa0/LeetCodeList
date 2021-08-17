import java.util.HashMap;
import java.util.Map;

public class LeetCode76 {
    public String minWindow(String s, String t) {
        Map<Character, Integer> window = new HashMap<>();
        Map<Character, Integer> need = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char te = t.charAt(i);
            need.put(te, need.getOrDefault(te , 0) + 1);
        }
        int left = 0, right = 0, valid = 0, start = 0, len = Integer.MAX_VALUE;
        while (right < s.length()){
            char c = s.charAt(right);
            right++;
            if (need.get(c) != null){
                window.put(c, window.getOrDefault(c, 0) + 1);
                if (need.get(c).intValue() == window.get(c).intValue()){
                    valid++;
                }
            }
            while (valid == need.size()){
                if (right - left < len){
                    start = left;
                    len = right - left;
                }
                char d = s.charAt(left);
                left++;
                if (need.get(d) != null){
                    if (need.get(d).intValue() == window.get(d).intValue()){
                        valid--;
                    }
                    window.put(d, window.getOrDefault(d, 0) - 1);
                }
            }
        }
        return len == Integer.MAX_VALUE ? "" : s.substring(start, start + len);
    }
}
