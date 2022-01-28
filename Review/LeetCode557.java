package Review;

public class LeetCode557 {
    public String reverseWords(String s) {
        s.trim();
        String[] strings = s.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (String temp : strings) {
            int len = temp.length();
            String ss = "";
            for (int i = len - 1; i >= 0; i--) {
                ss += temp.charAt(i) + "";
            }
            stringBuilder.append(ss + " ");
        }
        String res = stringBuilder.toString().trim();
        return res;
    }
}
