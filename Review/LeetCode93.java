package Review;

import java.util.ArrayList;
import java.util.List;

public class LeetCode93 {
    String s;
    int len;
    List<String> res;
    int[] segment;
    public List<String> restoreIpAddresses(String s) {
        this.s = s;
        this.len = s.length();
        res = new ArrayList<>();
        this.segment = new int[4];
        back(0, 0);
        return res;
    }

    private void back(int index, int dotcount) {
        if (dotcount == 4){
            if (index == len){
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < 4; i++) {
                    sb.append(segment[i]);
                    if (i != 3)
                        sb.append('.');
                }
                res.add(sb.toString());
            }
            return;
        }
        if (index == s.length())
            return;
        if (s.charAt(index) == '0'){
            segment[dotcount] = 0;
            back(index + 1, dotcount + 1);
        }

        int add = 0;
        for (int i = index; i < s.length(); i++) {
            add = add * 10 + (s.charAt(i) - '0');
            if (add > 0 && add <= 255){
                segment[dotcount] = add;
                back(i + 1, dotcount + 1);
            } else {
                break;
            }
        }
    }
}
