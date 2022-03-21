class Solution {
    List<String> res = new ArrayList<>();
    String digits;
    int len;
    Map<Character, String> map = new HashMap<>();
    public List<String> letterCombinations(String digits) {
        this.digits = digits;
        this.len = digits.length();
        if (len == 0) return res;
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        LinkedList<Character> list = new LinkedList<>();
        back(0, list);
        return res;
    }

    private void back(int index, LinkedList<Character> list) {
        if (index > len) return;
        if (list.size() == len) {
            StringBuilder sb = new StringBuilder();
            for (char a : list) {
                sb.append(a);
            }
            res.add(sb.toString());
            return;
        }
        String cur = map.get(digits.charAt(index));
        for (char a : cur.toCharArray()) {
            list.add(a);
            back(index + 1, list);
            list.removeLast();
        }
    }
}
