class Solution {
    private List<String> res = new ArrayList<>();
    private int n;
    public List<String> generateParenthesis(int n) {
        this.n = n;
        back(0, 0, "");
        return res;
    }

    private void back(int left, int right, String s) {
        if (s.length() == 2 * n) {
            res.add(s);
            return;
        }
        if (left < n) back(left + 1, right, s + "(");
        if (right < left) back(left, right + 1, s + ")");
    }
}
