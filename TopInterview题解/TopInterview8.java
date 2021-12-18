package TopInterview;

public class TopInterview8 {
    public int myAtoi(String s) {
        String str = s.trim();
        int len = str.length();
        if (len == 0)
            return 0;
        boolean flag = true;
        if (str.charAt(0) == '-' || str.charAt(0) == '+'){
            if (str.charAt(0) == '-')
                flag = false;
            str = str.substring(1);
        }
        long num = 0;
        for (char a :
                str.toCharArray()) {
            if (a <= '9' && a >= '0'){
                num = num * 10 + (a - '0');
                if (num > Integer.MAX_VALUE)
                    break;
            }else
                break;
        }
        if (flag == false){
            num = -num;
            return (int)Math.max(num, -Math.pow(2, 31));
        }
        return (int)Math.min(num, Math.pow(2, 31) - 1);
    }
}
