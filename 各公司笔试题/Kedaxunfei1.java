import java.util.Scanner;

public class keda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), x = scanner.nextInt(), k = scanner.nextInt();
        int[] ball = new int[n + 1];
        ball[x] = 1;
        for (int i = 0; i < k; i++) {
            int a = scanner.nextInt(), b = scanner.nextInt();
            if (ball[a] != 1 && ball[b] != 1){
                continue;
            }
            int temp = ball[a];
            ball[a] = ball[b];
            ball[b] = temp;
        }
        for (int i = 1; i < n + 1; i++) {
            if (ball[i] == 1)
                System.out.println(i);
        }
    }
}
