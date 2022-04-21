class Solution {
    public String decodeString(String s) {
        int len = s.length();
        int multi = 0;
        StringBuilder res = new StringBuilder();
        Stack<Integer> stackMulti = new Stack<>();
        Stack<String> stackRes = new Stack<>();
        for (char a : s.toCharArray()) {
            if (a == '[') {
                stackMulti.push(multi);
                stackRes.push(res.toString());
                multi = 0;
                res = new StringBuilder();
            } else if (a == ']') {
                StringBuilder temp = new StringBuilder();
                int cur = stackMulti.pop();
                for (int i = 0; i < cur; i++) {
                    temp.append(res);
                }
                res = new StringBuilder(stackRes.pop() + temp);
            } else if (a >= '0' && a <= '9') {
                multi = multi * 10 + (a - '0');
            } else {
                res.append(a);
            }
        }
        return res.toString();
    }
}
