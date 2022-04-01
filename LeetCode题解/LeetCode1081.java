class Solution {
    public String smallestSubsequence(String s) {
        int len = s.length();
        Stack<Character> stack = new Stack<>();
        int[] count = new int[26];
        boolean[] inStack = new boolean[26];
        for (char a : s.toCharArray()) {
            count[a - 'a']++;
        }
        for (char a : s.toCharArray()) {
            count[a - 'a']--;
            if (inStack[a - 'a']) continue;
            while (!stack.isEmpty() && stack.peek() > a) {
                if (count[stack.peek() - 'a'] > 0) {
                    inStack[stack.pop() - 'a'] = false;
                } else {
                    break;
                }
            }
            stack.add(a);
            inStack[a - 'a'] = true;
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}
