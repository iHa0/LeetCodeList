class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        String s = x + "";
        int len = s.length();
        int left = 0, right = len - 1;
        while (left < right) {
            if (left < right && s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}
