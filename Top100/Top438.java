package Top100;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Top438 {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        HashMap<Character, Integer> win = new HashMap<>();
        HashMap<Character, Integer> need = new HashMap<>();
        int pLen = p.length(), sLen = s.length();
        for (int i = 0; i < pLen; i++) {
            char a = p.charAt(i);
            need.put(a, need.getOrDefault(a, 0) + 1);
        }
        int vail= 0, left = 0, right = 0;
        while (right < sLen){
            char a = s.charAt(right);
            right++;
            if (need.containsKey(a)){
                win.put(a, win.getOrDefault(a, 0) + 1);
                if (win.get(a).intValue() == need.get(a).intValue())
                    vail++;
            }
            while (right - left >= pLen){
                char b = s.charAt(left);
                if (vail == need.size()){
                    res.add(left);
                }
                left++;
                if (need.containsKey(b)){
                    if (win.get(b).intValue() == need.get(b).intValue())
                        vail--;
                    win.put(b, win.get(b) - 1);
                }
            }
        }
        return res;
    }
}
