public class LeetCode717 {
    public boolean isOneBitCharacter(int[] bits) {
        int len = bits.length;
        int n = 0;
        while (n < len){
            if (bits[n] == 1){
                if (n + 2 < len){
                    n += 2;
                } else
                    return false;
            } else {
                if (n == len - 1)
                    return true;
                n++;
            }
        }
        return false;
    }
}
