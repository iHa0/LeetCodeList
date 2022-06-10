class Solution {
    public boolean isPalindrome(int x) {
        int num = 0, pre = x;
        if (x < 0) return false;
        x = Math.abs(x);
        while (x != 0) {
            num = num * 10 + x % 10;
            x /= 10;
        }
        return num == pre;
    }
}
