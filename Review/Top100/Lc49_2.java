class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] chs = s.toCharArray();
            Arrays.sort(chs);
            String sorts = new String(chs);
            if (map.containsKey(sorts)) {
                List<String> temp = map.get(sorts);
                temp.add(s);
                map.put(sorts, temp);
                continue;
            }
            List<String> newadd = new ArrayList<>();
            newadd.add(s);
            map.put(sorts, newadd);
        }
        return new ArrayList<List<String>>(map.values());
    }
}
