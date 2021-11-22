import java.util.HashMap;

public class Top76_2 {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> win = new HashMap<>();
        int left = 0, right = 0, vail = 0, start = 0, len = Integer.MAX_VALUE;
        for (int i = 0; i < t.length(); i++) {
            char a = t.charAt(i);
            need.put(a, need.getOrDefault(a, 0) + 1);
        }
        while (right < s.length()){
            char a = s.charAt(right);
            right++;
            if (need.containsKey(a)){
                win.put(a, win.getOrDefault(a, 0) + 1);
                if (need.get(a).intValue() == win.get(a).intValue()){
                    vail++;
                }
            }
            while (vail == need.size()){
                int temp = right - left;
                if (temp < len){
                    len = temp;
                    start = left;
                }
                char b = s.charAt(left);
                left++;
                if (need.containsKey(b)){
                    if (need.get(b).intValue() == win.get(b).intValue()){
                        vail--;
                    }
                    win.put(b, win.get(b) - 1);
                }
            }
        }
        if (len == Integer.MAX_VALUE)
            return "";
        return s.substring(start, start + len);
    }
}
