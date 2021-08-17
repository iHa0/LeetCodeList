public class LeetCode9 {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        int y = 0, temp1, temp2 = x;
        while (x > 0){
            temp1 = x % 10;
            x = x / 10;
            y = y * 10 + temp1;
        }
        return temp2 == y;
    }
}
