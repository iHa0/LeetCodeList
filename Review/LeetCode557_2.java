package Review;

public class LeetCode557_2 {
    public String reverseWords(String s) {
        char[] ch = s.toCharArray();
        int len = s.length();
        int i = 0;
        while (i < len){
            int start = i;
            while (i < len && ch[i] != ' ')
                i++;
            int left = start, right = i - 1;
            while (left < right){
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                left++;
                right--;
            }
            while (i < len && ch[i] == ' ')
                i++;
        }
        return new String(ch);
    }
}
