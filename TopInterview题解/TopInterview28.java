package TopInterview;

public class TopInterview28 {
    public int strStr(String haystack, String needle) {
        int hm = haystack.length(), nn = needle.length();
        if (nn == 0){
            return 0;
        }
        if (hm < nn){
            return -1;
        }
        int[] pi = new int[nn];
        for (int i = 1, j = 0; i < nn; i++) {
            while (j > 0 && needle.charAt(i) != needle.charAt(j)){
                j = pi[j - 1];
            }
            if (needle.charAt(i) == needle.charAt(j))
                j++;
            pi[i] = j;
        }
        for (int i = 0, j = 0; i < hm; i++) {
            while (j > 0 && haystack.charAt(i) != needle.charAt(j)){
                j = pi[j - 1];
            }
            if (haystack.charAt(i) == needle.charAt(j))
                j++;
            if (j == nn){
                return i - nn + 1;
            }
        }
        return -1;
    }
}
