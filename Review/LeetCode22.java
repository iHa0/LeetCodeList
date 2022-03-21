class Solution {
    List<String> res = new ArrayList<>();
    int n;
    public List<String> generateParenthesis(int n) {
        this.n = n;
        dfs(0, 0, "");
        return res;
    }

    private void dfs(int left, int right, String s) {
        if (s.length() == 2 * n) {
            res.add(s);
            return;
        }
        if (left < n) {
            dfs(left + 1, right, s + "(");
        }
        if (right < left) {
            dfs(left, right + 1, s + ")");
        }
    }
}
