package Review;

import java.util.HashSet;
import java.util.Set;

public class LeetCode1763 {
    char[] chars;
    int len;
    public String longestNiceSubstring(String s) {
        this.chars = s.toCharArray();
        this.len = s.length();
        int max = 0;
        String res = "";
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                boolean flag = check(i, j);
                if (flag == true){
                    int lens = j - i + 1;
                    if (max < lens){
                        max = lens;
                        res = s.substring(i, j + 1);
                    }
                }
            }
        }
        return res;
    }

    public boolean check(int i, int j){
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();
        for (int k = i; k <= j; k++) {
            char temp = chars[k];
            set1.add(temp);
            if (temp >= 'a' && temp <= 'z'){
                temp = (char) (temp - 'a' + 'A');
            }
            set2.add(temp);
        }
        return set1.size() == set2.size() * 2;
    }
}
