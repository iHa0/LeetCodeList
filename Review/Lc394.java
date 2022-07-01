class Solution {
    public String decodeString(String s) {
        StringBuilder res = new StringBuilder();
        int multi = 0;
        LinkedList<Integer> stackMulti = new LinkedList<>();
        LinkedList<String> stackRes = new LinkedList<>();
        for (char c : s.toCharArray()) {
            if (c == '[') {
                stackMulti.addLast(multi);
                stackRes.addLast(res.toString());
                multi = 0;
                res = new StringBuilder();
            } else if (c == ']') {
                StringBuilder temp = new StringBuilder();
                int curMulti = stackMulti.removeLast();
                for (int i = 0; i < curMulti; i++) temp.append(res);
                res = new StringBuilder(stackRes.removeLast() + temp);
            } else if (c >= '0' && c <= '9') {
                multi = multi * 10 + c - '0';
            } else res.append(c);
        }
        return res.toString();
    }
}
