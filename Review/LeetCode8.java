public class LeetCode8 {
    public int myAtoi(String s) {
        s = s.trim();
        int len = s.length();
        if (len == 0)
            return 0;
        long res = 0;
        boolean flag = true;
        if (s.charAt(0) == '-' || s.charAt(0) == '+'){
            if (s.charAt(0) == '-')
                flag = false;
            s = s.substring(1);
        }
        for (char a : s.toCharArray()) {
            if (a <= '9' && a >= '0'){
                res = res * 10 + a - '0';
                if (res >= Integer.MAX_VALUE)
                    break;
            } else
                break;
        }
        if (flag == false){
            res = -res;
            return (int) Math.max(res, -Math.pow(2, 31));
        }
        return (int) Math.min(res, Math.pow(2, 31) - 1);
    }
}
