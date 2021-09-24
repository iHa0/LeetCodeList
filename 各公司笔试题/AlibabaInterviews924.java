import java.util.Scanner;

public class Ali924 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String input = scanner.next();
        Character pre = input.charAt(0), now = input.charAt(1);
        int blue = 0, red = 0;
        if (pre.equals('R')){
            red++;
        }else {
            blue++;
        }
        for (int i = 1; i < input.length(); i++) {
            now = input.charAt(i);
            if (input.charAt(i) == 'R'){
                if (!now.equals(pre)){
                    red++;
                    pre = now;
                }else{
                    pre = now;
                    continue;
                }
            }else {
                if (!now.equals(pre)){
                    blue++;
                    pre = now;
                }else {
                    pre = now;
                    continue;
                }
            }
        }
        System.out.println(Math.min(blue, red) + 1);
    }
}
