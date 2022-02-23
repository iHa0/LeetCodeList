public class LeetCode917 {
    public String reverseOnlyLetters(String s) {
        int len = s.length();
        int left = 0, right = len - 1;
        char[] chars = s.toCharArray();
        while (left < right){
            while (chars[left] == '-' || !(chars[left] >= 'a' && chars[left] <= 'z') || !(chars[left] >= 'A' && chars[left] <= 'Z'))
                left++;
            while (chars[right] == '-' || !(chars[right] >= 'a' && chars[right] <= 'z') || !(chars[right] >= 'A' && chars[right] <= 'Z'))
                right--;
            swap(chars, left, right);
            left++;
            right--;
        }
        StringBuilder sb = new StringBuilder();
        for (char t : chars) {
            sb.append(t);
        }
        return sb.toString();
    }

    private void swap(char[] chars, int left, int right){
        char temp = chars[left];
        chars[left] = chars[right];
        chars[right] = temp;
    }
}
