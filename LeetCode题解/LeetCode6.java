import java.util.ArrayList;
import java.util.List;

public class LeetCode6 {
    public String convert(String s, int numRows) {
        if (numRows == 1)
            return s;
        String ress = "";
        int len = s.length();
        int q = numRows * 2 - 2;
        for (int i = 0; i < numRows; i++) {
            for (int j = i; j < len; j++) {
                if (j % q == i || j % q == (q - i)){
                    ress += s.charAt(j);
                }
            }
        }
        return ress;
    }
}
