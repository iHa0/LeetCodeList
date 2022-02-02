package Review;

public class LeetCode2000 {
    public String reversePrefix(String word, char ch) {
        int len = word.length();
        char[] chars = word.toCharArray();
        int flag = -1;
        for (int i = 0; i < len; i++) {
            if (chars[i] == ch){
                flag = i;
                break;
            }
        }
        if (flag == -1)
            return word;
        int left = 0, right = flag;
        while (left < right){
            char temp = chars[right];
            chars[right] = chars[left];
            chars[left] = temp;
            left++;
            right--;
        }
        return String.valueOf(chars);
    }
}
