class Solution {
    public String removeDuplicateLetters(String s) {
        int len = s.length();
        Stack<Character> stack = new Stack<>();
        int[] count = new int[26];
        boolean[] instack = new boolean[26];
        for (char a : s.toCharArray()) {
            count[a - 'a']++;
        }
        for (char a : s.toCharArray()) {
            count[a - 'a']--;
            if (instack[a - 'a']) continue;
            while (!stack.isEmpty() && stack.peek() > a) {
                if (count[stack.peek() - 'a'] == 0) {
                    break;
                } else {
                    instack[stack.pop() - 'a'] = false;
                }
            }
            stack.push(a);
            instack[a - 'a'] = true;
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}
