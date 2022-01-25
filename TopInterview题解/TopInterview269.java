package TopInterview;

import java.util.*;

public class TopInterview269 {
    public String alienOrder(String[] words) {
        HashMap<Character, Set<Character>> hashMap = new HashMap<>();
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if (words[i].length() > words[i + 1].length() && j == words[i].length() - 1)
                    return "";
                if (words[i].charAt(j) == words[i + 1].charAt(j))
                    continue;
                Set<Character> set = hashMap.getOrDefault(words[i].charAt(j), new HashSet<>());
                set.add(words[i + 1].charAt(j));
                hashMap.put(words[i].charAt(j), set);
                break;
            }
        }
        int[] degree = new int[26];
        Arrays.fill(degree, -1);
        for (String str : words) {
            for (char c : str.toCharArray()) {
                degree[c - 'a'] = 0;
            }
        }
        for (char key : hashMap.keySet()) {
            for (char val : hashMap.get(key)) {
                degree[val - 'a']++;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        Queue<Character> queue = new LinkedList<>();
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (degree[i] != -1)
                count++;
            if (degree[i] == 0)
                queue.add((char) ('a' + i));
        }
        while (!queue.isEmpty()){
            Character cur = queue.poll();
            stringBuilder.append(cur);
            if (hashMap.containsKey(cur)){
                Set<Character> set = hashMap.get(cur);
                for (char c : set) {
                    degree[c - 'a']--;
                    if (degree[c - 'a'] == 0)
                        queue.add(c);
                }
            }
        }
        if (stringBuilder.length() != count)
            return "";
        else
            return stringBuilder.toString();
    }
}
