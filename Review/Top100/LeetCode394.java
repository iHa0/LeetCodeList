class Solution {
    public String decodeString(String s) {
        int len = s.length();
        StringBuilder res = new StringBuilder();
        int multi = 0;
        Stack<String> stackRes = new Stack<>();
        Stack<Integer> stackMulti = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '[') {
                stackRes.push(res.toString());
                stackMulti.push(multi);
                res = new StringBuilder();
                multi = 0;
            }
            else if (c == ']') {
                int curMulti = stackMulti.pop();
                StringBuilder temp = new StringBuilder();
                for (int i = 0; i < curMulti; i++) {
                    temp.append(res);
                }
                res = new StringBuilder(stackRes.pop() + temp);
            }
            else if (c <= '9' && c >= '0') {
                multi = multi * 10 + Integer.parseInt(c + "");
            }
            else res.append(c);
        }
        return res.toString();
    }
}
