import java.util.Scanner;
//2021年7月22日
public class Ali01 {
    public static void main(String[] args) {
        int count, num, n = 2, aa = 0, bb = 0;
        double a, b, sum = 0;
        Scanner scanner = new Scanner(System.in);
        count = scanner.nextInt();
        while (count-- > 0){
            num = scanner.nextInt();
            while (num-- > 0){
                    a = scanner.nextFloat();
                    b = scanner.nextFloat();
                    sum += a / b;
            }
            if (sum  % 1 > 0.9999 || sum % 1 == 0 || sum % 1 < 0.00001){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
            sum = 0;
        }
    }
}
