package TopInterview;

public class TopInterview344 {
    public void reverseString(char[] s) {
        int len = s.length;
        int left = 0, right = len - 1;
        while (left < right){
            char temp = s[right];
            s[right] = s[left];
            s[left] = temp;
            left++;
            right--;
        }
    }
}
