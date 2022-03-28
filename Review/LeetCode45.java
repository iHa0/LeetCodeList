class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        Map<Character, Integer> map = new HashMap<>();
        int left = 0, right = 0;
        int res = 0;
        while (right < len) {
            char a = s.charAt(right++);
            map.put(a, map.getOrDefault(a, 0) + 1);
            while (map.get(a) > 1) {
                char b = s.charAt(left++);
                map.put(b, map.get(b) - 1);
            }
            res = Math.max(res, right - left);
        }
        return res;
    }
}
