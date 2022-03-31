class Solution {
    public String removeDuplicateLetters(String s) {
        int len = s.length();
        int[] count = new int[26];
        Stack<Character> stack = new Stack();
        boolean[] inStack = new boolean[26];
        for (char a : s.toCharArray()) {
            count[a - 'a']++;
        }
        for (char a : s.toCharArray()) {
            count[a - 'a']--;
            if (inStack[a - 'a']) continue;
            while (!stack.isEmpty() && stack.peek() > a) {
                if (count[stack.peek() - 'a'] == 0) break;
                inStack[stack.pop() - 'a'] = false;
            }
            stack.push(a);
            inStack[a - 'a'] = true;
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}
