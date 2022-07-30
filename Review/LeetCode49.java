class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int len = strs.length;
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String s = new String(ch);
            List<String> list = map.getOrDefault(s, new ArrayList<String>());
            list.add(strs[i]);
            map.put(s, list);
        }
        return new ArrayList<List<String>>(map.values());
    }
}
