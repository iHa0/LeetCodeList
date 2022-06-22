class Solution {
    public String reorganizeString(String s) {
        int len = s.length(), max = 0, maxIndex = 0;
        int[] count = new int[26];
        for (int i = 0; i < len; i++) {
            count[s.charAt(i) - 'a']++;
            if (max < count[s.charAt(i) - 'a']) {
                max = count[s.charAt(i) - 'a'];
                maxIndex = s.charAt(i) - 'a';
            }
        }
        if (max > (len + 1) / 2) return "";
        char[] res = new char[len];
        int index = 0;
        for (; index < len && count[maxIndex]-- > 0;) {
            res[index] = (char) (maxIndex + 'a');
            index += 2;
        }
        for (int i = 0; i < 26; i++) {
            while (count[i]-- > 0) {
                if (index >= len) index = 1;
                res[index] = (char) (i + 'a');
                index += 2;
            }
        }
        return new String(res);
    }
}
