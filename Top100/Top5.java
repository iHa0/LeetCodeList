public class Top5_2 {

    public String longestPalindrome(String s){
        int len = s.length();
        String res = "";
        for (int i = 0; i < len; i++) {
            String a = match(s, i, i);
            String b = match(s, i, i+1);
            res = res.length() > a.length()? res: a;
            res = res.length() > b.length()? res: b;
        }
        return res;
    }

    public String match(String s, int l, int r){
        while (l >=0 && r < s.length() && s.charAt(l) == s.charAt(r)){
            l--;
            r++;
        }
        return s.substring(l + 1, r);
    }
}
