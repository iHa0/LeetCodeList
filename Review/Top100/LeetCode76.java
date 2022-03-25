class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> win = new HashMap<>();
        HashMap<Character, Integer> need = new HashMap<>();
        for (char c : t.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }
        int left = 0, right = 0, len = s.length(), val = 0;
        int lf = 0, rf = 0, min = Integer.MAX_VALUE;
        while (right < len) {
            char a = s.charAt(right++);
            if (need.containsKey(a)) {
                win.put(a, win.getOrDefault(a, 0) + 1);
                if (need.get(a).intValue() == win.get(a).intValue()) val++;
            }
            while (val == need.size()) {
                if (min > right - left) {
                    min = right - left;
                    lf = left;
                    rf = right;
                }
                char b = s.charAt(left++);
                if (need.containsKey(b)) {
                    if (need.get(b).intValue() == win.get(b).intValue()) val--;
                    win.put(b, win.get(b) - 1);
                }
            }
        }
        return s.substring(lf, rf);
    }
}
