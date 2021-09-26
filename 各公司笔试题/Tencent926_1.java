import java.util.Scanner;

public class Tencent926 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int[] prime = new int[2263];
        int i, j, m = 0;
        for (i = 2; i < 20013; i++) {
            int flag = 0;
            for (j = 2; j < i; j++) {
                if (i % j == 0)
                    flag = 1;
            }
            if (flag == 0){
                prime[m++] = j;
            }
        }
        int a = 0, b = 0, x, x1, x2;
        for (int k = 0; k < T; k++) {
            x = scanner.nextInt();
            x1 = 1 + x;
            for (int l = 0; l < 2263; l++) {
                if (prime[l] >= x1){
                    a = prime[l];
                    break;
                }
            }
            x2 = a + x;
            for (int l = 0; l < 2263; l++) {
                if (prime[l] >= x2){
                    b = prime[l];
                    break;
                }
            }
            System.out.println(a * b);
        }
    }
}
