class Solution {
    public boolean isPalindrome(int x) {
        String s = x + "";
        int len = s.length(), left = 0, right = len - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}
