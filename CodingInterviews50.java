import java.util.Arrays;

public class CodingInterviews50 {
    public char firstUniqChar(String s) {
        int[] count = new int[128];
        Arrays.fill(count , 0);
        for (int i = 0; i < s.length(); i++) {
            count[(int)s.charAt(i)]++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (count[(int)s.charAt(i)] == 1){
                return s.charAt(i);
            }
        }
        return ' ';
    }
}
