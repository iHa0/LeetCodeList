package TopInterview;

public class TopInterview125 {
    public boolean isPalindrome(String s) {
        int len = s.length();
        int left = 0, right = len - 1;
        while (left < right){
            while (left < right && !(s.charAt(left) >= 'a' && s.charAt(left) <= 'z' || s.charAt(left) >= 'A' && s.charAt(left) <= 'Z' || s.charAt(left) >= '0' && s.charAt(left) <= '9'))
                left++;
            while (right > left && !(s.charAt(right) >= 'a' && s.charAt(right) <= 'z' || s.charAt(right) >= 'A' && s.charAt(right) <= 'Z' || s.charAt(right) >= '0' && s.charAt(right) <= '9'))
                right--;
            if (s.charAt(left) == s.charAt(right) || s.charAt(left) - 'a' >= 0 && s.charAt(right) - 'A' >= 0 && s.charAt(left) - 'a' == s.charAt(right) - 'A' || s.charAt(left) - 'A' >= 0 && s.charAt(right) - 'a' >= 0 && s.charAt(left) - 'A' == s.charAt(right) - 'a'){
                left++;
                right--;
            }else
                return false;
        }
        return true;
    }
}
