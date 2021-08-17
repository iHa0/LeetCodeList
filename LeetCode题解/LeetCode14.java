public class LeetCode14 {
    public String longestCommonPrefix(String[] strs) {
        int strLen = strs.length;
        if (strLen == 1)
            return strs[0];
        String res = "";
        int i, j;
        char[] chars = new char[strLen];
        for (i = 0; i < strs[0].length(); i++) {
            for (j = 0; j < strLen; j++) {
                if (i < strs[j].length()){
                    char a = strs[0].charAt(i), b = strs[j].charAt(i);
                    if (a != b)
                        return res;
                }else {
                    return res;
                }
            }
            res += strs[0].charAt(i);
        }
        return res;
    }
}
