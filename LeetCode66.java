public class LeetCode66 {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) return digits;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
    public int[] plusOne1(int[] digits) {
        int len = digits.length, sum = 0, temp = 0;
        for (int i = len - 1; i >= 0 ; i--) {
            sum *= 10;
            sum += digits[i];
        }
        sum += 1;
        String a = String.valueOf(sum);
        int[] res = new int[a.length()];
        for (int i = a.length() - 1; i >= 0; i--) {
            res[i] = sum % 10;
            sum /= 10;
        }
        return res;
    }
}
