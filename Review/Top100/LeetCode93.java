class Solution {
    List<String> res = new ArrayList<>();
    int dot = 0;
    int[] merge;
    int len;
    String s;
    public List<String> restoreIpAddresses(String s) {
        this.s = s;
        this.len = s.length();
        this.merge = new int[len];
        back(0, 0);
        return res;
    }

    private void back(int count, int index) {
        if (count == 4) {
            if (index == len) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < 4; i++) {
                    sb.append(merge[i]);
                    if (i != 3) sb.append(".");
                }
                res.add(sb.toString());
            }
            return;
        }
        if (index == len) return;
        if (s.charAt(index) == '0') {
            merge[count] = 0;
            back(count + 1, index + 1);
        }
        int sum = 0;
        for (int i = index; i < len; i++) {
            sum = sum * 10 + (s.charAt(i) - '0');
            if (sum > 0 && sum <= 255) {
                merge[count] = sum;
                back(count + 1, i + 1);
            } else {
                break;
            }
        }
    }
}
