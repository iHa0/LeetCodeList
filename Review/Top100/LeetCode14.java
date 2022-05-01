class Solution {
    public String longestCommonPrefix(String[] strs) {
        int len = strs.length;
        if (len == 0) return "";
        int l = strs[0].length();
        for (int i = 0; i < l; i++) {
            char a = strs[0].charAt(i);
            for (int j = 1; j < len; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != a) return strs[0].substring(0, i);
            }
        }
        return strs[0];
    }
}
