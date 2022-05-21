class Solution {
    public String reorganizeString(String s) {
        int len = s.length(), max = 0, maxIndex = 0;
        int[] count = new int[26];
        for (char a : s.toCharArray()) {
            count[a - 'a']++;
            if (max < count[a - 'a']) {
                max = count[a - 'a'];
                maxIndex = a - 'a';
            }
        }
        if (max > (len + 1) / 2) return "";
        int index = 0;
        char[] chars = new char[len];
        for (; index < len && count[maxIndex]-- > 0;) {
            chars[index] = (char) (maxIndex + 'a');
            index += 2;
        }
        for (int i = 0; i < 26; i++) {
            while (count[i]-- > 0) {
                if (index >= len) index = 1;
                chars[index] = (char) (i + 'a');
                index += 2;
            }
        }
        return new String(chars);
    }
}
