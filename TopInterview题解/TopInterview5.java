package TopInterview;

public class TopInterview5 {
    public String longestPalindrome(String s) {
        int len = s.length();
        String res = "";
        for (int i = 0; i < len; i++) {
            String a = search(s, i, i);
            String b = search(s, i, i + 1);
            res = res.length() > a.length() ? res : a;
            res = res.length() > b.length() ? res : b;
        }
        return res;
    }
    public String search(String s, int left, int right){
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
}
