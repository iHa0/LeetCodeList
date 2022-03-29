class Solution {
    List<List<String>> res = new ArrayList<>();
    String s;
    int len;
    public List<List<String>> partition(String s) {
        this.s = s;
        this.len = s.length();
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
            if (match(index, i)) {
                list.add(s.substring(index, i + 1));
                back(list, i + 1);
                list.removeLast();
            }
        }
    }

    private boolean match(int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}
