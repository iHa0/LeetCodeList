class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int dummy = 0, n = x;
        while (n > 0) {
            dummy = dummy * 10 + n % 10;
            n /= 10;
        }
        return dummy == x;
    }
}
