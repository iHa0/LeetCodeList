import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LeetCode30 {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> res = new ArrayList<>();
        int wordNum = words.length;
        if (wordNum == 0)
            return res;
        int wordLen = words[0].length();
        HashMap<String, Integer> all = new HashMap<>();
        for (String a : words) {
            all.put(a, all.getOrDefault(a, 0) + 1);
        }
        for (int i = 0; i < s.length() - wordNum * wordLen + 1; i++) {
            HashMap<String, Integer> hasWord = new HashMap<>();
            int num = 0;
            while (num < wordNum) {
                String temp = s.substring(i + num * wordLen, i + (num + 1) * wordLen);
                if (all.containsKey(temp)) {
                    hasWord.put(temp, hasWord.getOrDefault(temp, 0) + 1);
                    if (hasWord.get(temp) > all.get(temp))
                        break;
                } else {
                    break;
                }
                num++;
            }
            if (num == wordNum)
                res.add(i);
        }
        return res;
    }
}
