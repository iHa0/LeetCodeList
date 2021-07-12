public class LeetCode7 {
    public int reverse(int x) {
        long xx = (long)x, temp1, res = 0;
        while (x != 0){
            temp1 = x % 10;
            x = x / 10;
            res = res * 10 + temp1;
        }
        return (int)res == res ? (int)res : 0;
    }
}
