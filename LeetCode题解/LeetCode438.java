import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode438 {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        Map<Character, Integer> need = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();
        for (int i = 0; i < p.length(); i++) {
            need.put(p.charAt(i), need.getOrDefault(p.charAt(i), 0) + 1);
        }
        int left = 0, right = 0, valid = 0, start = 0, len = 0;
        while (right < s.length()){
            char c = s.charAt(right);
            right++;
            if (need.get(c) != null){
                window.put(c, window.getOrDefault(c, 0) + 1);
                if (window.get(c).intValue() == need.get(c).intValue()){
                    valid += need.get(c).intValue();
                }
            }
            while (valid == p.length()){
                if ((right - left) == p.length()){
                    res.add(left);
                }
                char d = s.charAt(left);
                left++;
                if (need.get(d) != null){
                    if (window.get(d).intValue() == need.get(d).intValue()){
                        valid -= need.get(d).intValue();
                    }
                    window.put(d, window.getOrDefault(d, 0) - 1);
                }
            }
        }
        return res;
    }
}
