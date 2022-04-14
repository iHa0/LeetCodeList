class Solution {
    public String minWindow(String s, String t) {
        int len = s.length();
        Map<Character, Integer> need = new HashMap<>();
        Map<Character, Integer> win = new HashMap<>();
        int val = 0, left = 0, right = 0;
        int min = Integer.MAX_VALUE, l = 0, r = 0;
        for (char a : t.toCharArray()) {
            need.put(a, need.getOrDefault(a, 0) + 1);
        }
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
                    l = left - 1;
                    r = right;
                }
            }
        }
        return s.substring(l, r);
    }
}
