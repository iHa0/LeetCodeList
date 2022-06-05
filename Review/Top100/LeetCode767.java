class Solution {
    public String reorganizeString(String s) {
        int len = s.length(), maxIndex = 0, max = 0;
        int[] count = new int[26];
        for (char a : s.toCharArray()) {
            count[a - 'a']++;
            if (count[a - 'a'] > max) {
                max = count[a - 'a'];
                maxIndex = a - 'a';
            }
        }
        if (max > (len + 1) / 2) return "";
        char[] chars = new char[len];
        int index = 0;
        for (; index < len && count[maxIndex] > 0;) {
            chars[index] = (char) (maxIndex + 'a');
            count[maxIndex]--;
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
