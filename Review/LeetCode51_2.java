class Solution {
    List<List<String>> res = new ArrayList<>();
    Set<Integer> l = new HashSet<>();
    Set<Integer> left = new HashSet<>();
    Set<Integer> right = new HashSet<>();
    int n;

    public List<List<String>> solveNQueens(int n) {
        this.n = n;
        LinkedList<Integer> path = new LinkedList<>();
        back(0, path);
        return res;
    }

    private void back(int i, LinkedList<Integer> path) {
        if (i == n) {
            List<String> temp = path2String(path);
            res.add(temp);
            return;
        }
        for (int j = 0; j < n; j++) {
            if (!l.contains(j) && !left.contains(i + j) && !right.contains(i - j)) {
                l.add(j);
                left.add(i + j);
                right.add(i - j);
                path.add(j);
                back(i + 1, path);
                path.removeLast();
                right.remove(i - j);
                left.remove(i + j);
                l.remove(j);
            }
        }
    }

    private List<String> path2String(LinkedList<Integer> path) {
        List<String> res = new ArrayList<>();
        for (int a : path) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) sb.append(".");
            sb.replace(a, a + 1, "Q");
            res.add(sb.toString());
        }
        return res;
    }
}
