public class LeetCode125 {
    public boolean isPalindrome(String s) {
        if (s == " ")
            return true;
        int len = s.length();
        char[] ch = new char[len];
        int n = 0, m = 0;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                ch[n++] = (char)(s.charAt(i) + 32);
            }
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                ch[n++] = s.charAt(i);
            }
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                ch[n++] = s.charAt(i);
            }
        }
        for (int i = 0, j = n - 1; i < j; i++, j--) {
            if (ch[i] != ch[j]){
                return false;
            }
        }
        return true;
    }
}
