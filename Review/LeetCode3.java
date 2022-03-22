class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        int left = 0, right = 0;
        Map<Character, Integer> map = new HashMap<>();
        int max = 0;
        while (right < len) {
            char a = s.charAt(right);
            right++;
            map.put(a, map.getOrDefault(a, 0) + 1);
            while (map.get(a) > 1) {
                char b = s.charAt(left);
                left++;
                map.put(b, map.get(b) - 1);
            }
            max = Math.max(max, right - left);
        }
        return max;
    }
}
