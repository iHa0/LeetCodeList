class Solution {
    List<String> res = new ArrayList<>();
    String s;
    boolean[] used;
    int len;
    char[] chars;
    public String[] permutation(String s) {
        this.chars = s.toCharArray();
        Arrays.sort(chars);
        this.len = s.length();
        this.used = new boolean[len];
        LinkedList<Character> list = new LinkedList<>();
        back(list);
        return res.toArray(new String[0]);
    }

    private void back(LinkedList<Character> list) {
        if (list.size() == len) {
            StringBuilder sb = new StringBuilder();
            for (char a : list) sb.append(a);
            res.add(sb.toString());
            return;
        }
        for (int i = 0; i < len; i++) {
            if (used[i]) continue;
            if (i > 0 && chars[i] == chars[i - 1] && !used[i - 1]) continue;
            used[i] = true;
            list.add(chars[i]);
            back(list);
            list.removeLast();
            used[i] = false;
        }
    }
}
