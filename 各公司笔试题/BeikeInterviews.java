import java.util.HashSet;

public class BeikeInterviews3 {
    public String NS_String(String s, int k){
        int[] letter = new int[26];
        int len = s.length(), j = 0, m = 0, r = 0, l = 0;
        for (int i = 0; i < len; i++) {
            letter[(s.charAt(i) - 'a')]++;
        }
        String letters = "";
        for (int i = 0; i < letter.length; i++) {
            if (letter[i] != 0){
                letters += (char)('a' + i);
            }
        }
        HashSet<Character> hashSet = new HashSet<>();
        for (int i = 0; i < k; i++) {
            hashSet.add(letters.charAt(i));
        }
        char[] chars = s.toCharArray();
        for (int i = 0; i < len; i++) {
            if (hashSet.contains(chars[i])){
                chars[i] = ' ';
            }
        }
        String res = "";
        for (int i = 0; i < len; i++) {
            if (chars[i] != ' '){
                res += chars[i];
            }
        }
        return res;
    }
}
