class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String[] strs = s.split(" ");
        int len = strs.length;
        StringBuilder sb = new StringBuilder();
        for (int i = len - 1; i >= 0; i--) {
            if (strs[i].length() == 0) continue;
            sb.append(strs[i]);
            if (i != 0) sb.append(" ");
        }
        return sb.toString();
    }
}
