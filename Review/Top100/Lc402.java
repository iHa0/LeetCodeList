class Solution {
    public String removeKdigits(String num, int k) {
        int len = num.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            char a = num.charAt(i);
            while (k > 0 && sb.length() > 0 && sb.charAt(sb.length() - 1) > a) {
                sb.deleteCharAt(sb.length() - 1);
                k--;
            }
            if (sb.length() == 0 && a == '0') continue;
            sb.append(a);
        }
        String res = sb.toString().substring(0, Math.max(0, sb.length() - k));
        return res.length() == 0 ? "0" : res;
    }
}
