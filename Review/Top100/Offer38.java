class Solution {
    int len;
    char[] chars;
    List<String> res = new ArrayList<>();
    boolean[] used;

    public String[] permutation(String s) {
        this.len = s.length();
        this.chars = s.toCharArray();
        this.used = new boolean[len];
        Arrays.sort(chars);
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
            list.add(chars[i]);
            used[i] = true;
            back(list);
            used[i] = false;
            list.removeLast();
        }
    }
}
