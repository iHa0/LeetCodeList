class Solution {
    public String decodeString(String s) {
        int len = s.length();
        Stack<String> stackRes = new Stack<>();
        Stack<Integer> stackMulti = new Stack<>();
        StringBuilder res = new StringBuilder();
        int multi = 0;
        for (char c : s.toCharArray()) {
            if (c == '[') {
                stackRes.push(res.toString());
                stackMulti.push(multi);
                multi = 0;
                res = new StringBuilder();
            }
            else if (c == ']') {
                StringBuilder temp = new StringBuilder();
                int curMulti = stackMulti.pop();
                for (int i = 0; i < curMulti; i++) {
                    temp.append(res);
                }
                res = new StringBuilder(stackRes.pop() + temp);
            }
            else if (c >= '0' && c <= '9') {
                multi = multi * 10 + Integer.parseInt(c + "");
            }
            else res.append(c);
        }
        return res.toString();
    }
}
