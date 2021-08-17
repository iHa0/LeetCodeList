public class LeetCode191 {
    public int hammingWeight(int n) {
        int count = 0;
        String a = Integer.toBinaryString(n);
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '1')
                count ++;
        }
        return count;
    }
}
