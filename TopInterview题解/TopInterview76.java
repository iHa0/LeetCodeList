package TopInterview;

import java.util.HashMap;

public class TopInterview76 {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> win = new HashMap<>();
        HashMap<Character, Integer> need = new HashMap<>();
        int slen = s.length(), tlen = t.length();
        for (int i = 0; i < tlen; i++) {
            char a = t.charAt(i);
            need.put(a, need.getOrDefault(a, 0) + 1);
        }
        int left = 0, right = 0, val = 0, min = Integer.MAX_VALUE;
        String res = "";
        while (right < slen){
            char a = s.charAt(right);
            right++;
            if (need.containsKey(a)){
                win.put(a, win.getOrDefault(a, 0) + 1);
                if (need.get(a).intValue() == win.get(a).intValue()){
                    val++;
                }
            }
            while (val == need.size()){
                int temp_num = right - left + 1;
                if (min > temp_num){
                    res = s.substring(left, right);
                    min = temp_num;
                }
                char b = s.charAt(left);
                left++;
                if (need.containsKey(b)){
                    if (need.get(b).intValue() == win.get(b).intValue())
                        val--;
                    win.put(b, win.get(b) - 1);
                }
            }
        }
        return res;
    }
}
