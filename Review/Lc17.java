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
        back(list, 0);
        return res;
    }

    private void back(LinkedList<Character> list, int index) {
        if (index > len) return;
        if (list.size() == len) {
            StringBuilder sb = new StringBuilder(0);
            for (char a : list) sb.append(a);
            res.add(sb.toString());
            return;
        }
        String curStr = map.get(digits.charAt(index));
        for (char c : curStr.toCharArray()) {
            list.add(c);
            back(list, index + 1);
            list.removeLast();
        }
    }
}
