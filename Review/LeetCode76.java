class Solution {
    public String minWindow(String s, String t) {
        Map<Character, Integer> win = new HashMap<>();
        Map<Character, Integer> need = new HashMap<>();
        for (char a : t.toCharArray()) {
            need.put(a, need.getOrDefault(a, 0) + 1);
        }
        int left = 0, right = 0, len = s.length(), val = 0;
        int min = Integer.MAX_VALUE, lf = 0, lr = 0;
        while (right < len) {
            char a = s.charAt(right++);
            if (need.containsKey(a)) {
                win.put(a, win.getOrDefault(a, 0) + 1);
                if (win.get(a).intValue() == need.get(a).intValue()) val++;
            }
            while (val == need.size()) {
                char b = s.charAt(left++);
                if (need.containsKey(b)) {
                    if (win.get(b).intValue() == need.get(b).intValue()) val--;
                    win.put(b, win.get(b) - 1);
                }
                if (min > right - left) {
                    min = right - left;
                    lf = left - 1;
                    lr = right;
                }
            }  
        }
        return s.substring(lf, lr);
    }
}
