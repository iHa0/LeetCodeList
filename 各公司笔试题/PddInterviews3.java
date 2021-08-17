import java.util.ArrayList;
import java.util.Scanner;

public class PddInterviews3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        int c = scanner.nextInt();
        int[] in = new int[n];
        for (int i = 0; i < n; i++) {
            in[i] = scanner.nextInt();
        }
        int m = 0, flag = 0, sum = 0;
        ArrayList<Integer> temp = new ArrayList<>();
        while (m < n){
            if (in[m] <= t){
                temp.add(in[m]);
            }
            if (in[m] > t){
                flag = m;
                if (temp.size() - c + 1 > 0){
                    sum += temp.size() - c + 1;
                }
                temp = new ArrayList<>();
            }
            m++;
        }
        if (flag != m - 1){
            if (temp.size() - c + 1 > 0){
                sum += temp.size() - c + 1;
            }
        }
        System.out.println(sum);
    }
}
