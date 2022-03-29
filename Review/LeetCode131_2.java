class Solution {
    List<List<String>> res = new ArrayList<>();
    boolean[][] g;
    int len;
    String s;
    public List<List<String>> partition(String s) {
        this.len = s.length();
        this.s = s;
        this.g = new boolean[len][len];
        for (int i = 0; i < len; i++) {
            Arrays.fill(g[i], true);
        }
        for (int i = len - 2; i >= 0; i--) {
            for (int j = i + 1; j < len; j++) {
                g[i][j] = s.charAt(i) == s.charAt(j) && g[i + 1][j - 1];
            }
        }
        LinkedList<String> list = new LinkedList<>();
        back(list, 0);
        return res;
    }

    private void back(LinkedList<String> list, int index) {
        if (index == len) {
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = index; i < len; i++) {
            if (g[index][i]) {
                list.add(s.substring(index, i + 1));
                back(list, i + 1);
                list.removeLast();
            }
        }
    }
}
