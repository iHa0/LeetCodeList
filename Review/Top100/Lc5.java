package Top100Review;

public class Lc5 {
    int len;
    String s;
    public String longestPalindrome(String s) {
        this.len = s.length();
        this.s = s;
        String res = "";
        for (int i = 0; i < len; i++) {
            String a = search(i, i);
            String b = search(i, i + 1);
            res = res.length() > a.length() ? res : a;
            res = res.length() > b.length() ? res : b;
        }
        return res;
    }

    public String search(int left, int right){
        while (left >= 0 && right < len && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
}
