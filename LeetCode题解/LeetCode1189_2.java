import java.util.Arrays;

public class LeetCode1189_2 {
    public int maxNumberOfBalloons(String text) {
        int[] count = new int[5];
        for (int i = 0; i < text.length(); i++) {
            char a = text.charAt(i);
            if (a == 'a')
                count[0]++;
            else if (a == 'b')
                count[1]++;
            else if (a == 'l')
                count[2]++;
            else if (a == 'o')
                count[3]++;
            else if (a == 'n')
                count[4]++;
        }
        count[2] /= 2;
        count[3] /= 2;
        Arrays.sort(count);
        System.out.println(Arrays.toString(count));
        return count[0];
    }
}
