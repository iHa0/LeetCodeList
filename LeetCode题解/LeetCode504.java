public class LeetCode504 {
    public String convertToBase7(int num) {
        boolean flag = true;
        if (num == 0)
            return "0";
        if (num < 0) {
            flag = false;
            num = Math.abs(num);
        }
        StringBuffer sb = new StringBuffer();
        while (num > 0){
            sb.append(num % 7);
            num /= 7;
        }
        sb.reverse();
        if (!flag)
            return "-" + sb.toString();
        else
            return sb.toString();
    }
}
