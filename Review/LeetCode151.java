class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String[] strs = s.split(" ");
        int len = strs.length;
        StringBuilder sb = new StringBuilder();
        for (int i = len - 1; i >= 0; i--) {
            String temp = strs[i];
            if (temp.length() > 0 && !temp.equals(" ")) {
                sb.append(temp);
                if (i != 0) sb.append(" ");
            } 
            
        }
        return sb.toString();
    }
}
