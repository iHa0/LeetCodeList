class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> res = new ArrayList<>();
        int len = s.length();
        int wordCount = words.length, wordLen = words[0].length();
        Map<String, Integer> need = new HashMap<>();
        for (String a : words) {
            need.put(a, need.getOrDefault(a, 0) + 1);
        }
        for (int i = 0; i < len - wordCount * wordLen + 1; i++) {
            int num = 0;
            Map<String, Integer> win = new HashMap<>();
            while (num < wordCount) {
                String temp = s.substring(i + num * wordLen, i + (num + 1) * wordLen);
                if (need.containsKey(temp)) {
                    win.put(temp, win.getOrDefault(temp, 0) + 1);
                } else {
                    break;
                }
                if (win.get(temp) > need.get(temp)) break;
                num++;
            }
            if (num == wordCount) res.add(i);
        }
        return res;
    }
}
