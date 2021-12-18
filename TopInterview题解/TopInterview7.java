package TopInterview;

public class TopInterview7 {
    public int reverse(int x) {
        if (x == 0)
            return 0;
        if (!(x <= Math.pow(2, 31) - 1 && x >= -(Math.pow(2, 31)))){
            return 0;
        }
        String a = String.valueOf(x);
        char[] s = a.toCharArray();
        int len = a.length();
        int left = 0, right = len - 1;
        while (!(s[left] >= '0' && s[left] <= '9'))
            left++;
        while (!(s[right] >= '1' && s[right] <= '9'))
            right--;
        int end = right + 1;
        while (left < right){
            char temp1 = s[left];
            s[left] = s[right];
            s[right] = temp1;
            right--;
            left++;
        }
        String temp = "";
        for (int i = 0; i < end; i++) {
            temp += s[i];
        }
        int res = 0;
        try {
            res = Integer.parseInt(temp);
        }catch (Exception e){
            return 0;
        }
        return res;
    }
}
