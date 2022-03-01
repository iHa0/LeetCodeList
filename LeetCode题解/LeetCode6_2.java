public class LeetCode6 {
    public String convert(String s, int numRows) {
        int len = s.length();
        StringBuilder sb = new StringBuilder();
        if (s.length() <= numRows || s.length() == 1 || numRows == 1)
            return s;
        for (int i = 0; i < numRows; i++) {
            int a = 2 * (numRows - i - 1), b = 2 * i;
            int cur = i;
            sb.append(s.charAt(cur));
            while (cur < len){
                if (a != 0 && cur + a < len){
                    sb.append(s.charAt(cur + a));
                }
                cur += a;
                if (b != 0 && cur < len && cur + b < len){
                    sb.append(s.charAt(cur + b));
                }
                cur += b;
            }
        }
        return sb.toString();
    }
}
