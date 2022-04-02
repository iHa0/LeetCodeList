class Solution {
    private String s;
    private int len;
    public String longestPalindrome(String s) {
        this.s = s;
        this.len = s.length();
        String res = "";
        for (int i = 0; i < len; i++) {
            String a = search(i, i);
            String b = search(i, i + 1);
            res = a.length() > res.length() ? a : res;
            res = b.length() > res.length() ? b : res;
        }
        return res;
    }
    
    private String search(int left, int right) {
        while (left >= 0 && right < len && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
}
