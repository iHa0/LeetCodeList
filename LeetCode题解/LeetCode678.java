class Solution {
    public boolean checkValidString(String s) {
        int len = s.length();
        int left = 0, right = 0;
        for (int i = 0; i < len; i++) {
            left += s.charAt(i) == ')' ? -1 : 1;
            right += s.charAt(len - i - 1) == '(' ? -1 : 1;
            if (left < 0 || right < 0) return false;
        }
        return true;
    }
}
