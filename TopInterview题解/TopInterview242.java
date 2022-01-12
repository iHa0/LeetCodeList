package TopInterview;

public class TopInterview242 {
    public boolean isAnagram(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();
        if (sLen != tLen)
            return false;
        int[] ss = new int[26];
        int[] tt = new int[26];
        for (int i = 0; i < sLen; i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);
            ss[a - 'a']++;
            tt[b - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (ss[i] != tt[i])
                return false;
        }
        return true;
    }
}
