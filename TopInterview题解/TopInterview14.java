package TopInterview;

public class TopInterview14 {
    public String longestCommonPrefix(String[] strs) {
        String res = "";
        int len = strs.length;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < len; i++) {
            int a = strs[i].length();
            min = Math.min(min, a);
        }
        for (int i = 0; i < min; i++) {
            char temp = strs[0].charAt(i);
            for (int l = 1; l < len; l++) {
                if (strs[l].charAt(i) != temp)
                    return res;
            }
            res += temp;
        }
        return res;
    }
}
