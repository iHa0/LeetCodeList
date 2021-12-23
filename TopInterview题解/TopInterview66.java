package TopInterview;

public class TopInterview66 {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        int flag = 1;
        for (int i = len - 1; i  >= 0; i--) {
            int temp = digits[i] + flag;
            if (temp < 10){
                digits[i] = temp;
                flag = 0;
                return digits;
            }else {
                flag = 1;
                digits[i] = temp % 10;
            }
        }
        int[] newRes = new int[len + 1];
        newRes[0] = flag;
        if (flag == 1){
            for (int i = 0; i < len; i++) {
                newRes[i + 1] = digits[i];
            }
        }
        return newRes;
    }
}
