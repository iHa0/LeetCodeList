public class LeetCode151 {
    public String reverseWords(String s) {
        s = s.trim();
        String res = "";
        String[] newStr = s.split(" ");
        for (int i = newStr.length - 1; i >= 0 ; i--) {
            if (newStr[i].length() == 0)
                continue;
            res += newStr[i] + " ";
        }
        res = res.trim();
        return res;
    }
}
