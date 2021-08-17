public class CodingInterviews5 {
    public String replaceSpace(String s) {
        int len = s.length(), i, p = 0;
        char[] chars = new char[len * 3];
        for (i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' '){
                chars[p++] = '%';
                chars[p++] = '2';
                chars[p++] = '0';
            }else {
                chars[p++] = ch;
            }
        }
        String res = new String(chars , 0 , p);
        return res;
    }
}
