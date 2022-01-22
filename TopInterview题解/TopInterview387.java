package TopInterview;

import java.util.HashMap;

public class TopInterview387 {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        char[] chars = s.toCharArray();
        for (char a : chars) {
            hashMap.put(a, hashMap.getOrDefault(a, 0) + 1);
        }
        for (int i = 0; i < chars.length; i++) {
            char a = chars[i];
            if (hashMap.get(a) == 1){
                return i;
            }
        }
        return -1;
    }
}
