class Solution {
    public String reorganizeString(String s) {
        int len = s.length(), max = Integer.MIN_VALUE, maxIndex = 0;
        int[] count = new int[26];
        for (char a : s.toCharArray()) {
            count[a - 'a']++;
            if (max < count[a - 'a']) {
                max = count[a - 'a'];
                maxIndex = a - 'a';
            }
        }
        if (max > (len + 1) / 2) return "";
        char[] ch = new char[len];
        int index = 0;
        for (; index < len && count[maxIndex] > 0;) {
            ch[index] = (char)(maxIndex + 'a');
            count[maxIndex]--;
            index += 2;
        }
        for (int i = 0; i < 26; i++) {
            while (count[i]-- > 0) {
                if (index >= len) index = 1;
                ch[index] = (char)(i + 'a');
                index += 2;
            }
        }
        return new String(ch);
    }
}
