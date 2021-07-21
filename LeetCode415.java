public class LeetCode415 {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int temp = 0, m = num1.length() - 1, n = num2.length() - 1;
        while (m >= 0 || n >= 0 || temp != 0){
            if (m >= 0)
                temp += num1.charAt(m--) - '0';
            if (n >= 0)
                temp += num2.charAt(n--) - '0';
            sb.append(temp % 10);
            temp /= 10;
        }
        return sb.reverse().toString();
    }
}
