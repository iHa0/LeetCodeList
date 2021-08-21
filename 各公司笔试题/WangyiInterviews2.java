import java.util.ArrayList;
import java.util.Scanner;

public class Wangyi2 {
    public char findKthBit(int n, int k){
        String res = "a", temp = "";
        if (n == 1)
            return res.charAt(0);
        for (int i = 1; i < n; i++) {
            temp = "";
            char l = (char) ('a' + i);
            for (int j = 0; j < res.length(); j++) {
                temp += (char)('z' -(int)(res.charAt(j) - 'a'));
            }
            res += l;
//            for (int j = res.length() - 2; j >= 0; j--) {
//                res += temp.charAt(j);
//            }
            String reverse = new StringBuffer(temp).reverse().toString();
            res += reverse;
        }
        System.out.println(res);
        return res.charAt(k - 1);
    }
}
