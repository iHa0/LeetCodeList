package TopInterview;

import java.util.HashMap;
import java.util.Set;

public class TopInterview242_2 {
    public boolean isAnagram(String s, String t) {
        int sLen = s.length(), tLen = t.length();
        if (sLen != tLen)
            return false;
        HashMap<Character, Integer> hashMap1 = new HashMap<>();
        HashMap<Character, Integer> hashMap2 = new HashMap<>();
        for (int i = 0; i < sLen; i++) {
            char ch = s.charAt(i);
            char chh = t.charAt(i);
            hashMap1.put(ch, hashMap1.getOrDefault(ch, 0) + 1);
            hashMap2.put(chh, hashMap2.getOrDefault(chh, 0) + 1);
        }
        Set<Character> set = hashMap1.keySet();
        for (char a: set){
            if (hashMap1.get(a) == null || hashMap2.get(a) == null || hashMap1.get(a).intValue() != hashMap2.get(a).intValue())
                return false;
        }
        return true;
    }
}
