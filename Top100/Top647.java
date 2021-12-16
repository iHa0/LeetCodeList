package Top100;

public class Top647 {
    int ress = 0;
    public int countSubstrings(String s) {
        int len = s.length();
        int res = len;
        for (int i = 0; i < len; i++) {
            res(s, i, i);
            res(s, i, i + 1);
        }
        return ress;
    }
    public void res(String s, int left, int right){
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
            ress++;
        }
    }
}
