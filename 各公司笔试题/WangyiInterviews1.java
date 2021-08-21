import java.util.ArrayList;
import java.util.Scanner;

public class Wangyi1 {
    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>();
        int M;
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        Scanner scanner1 = new Scanner(line);
        while (scanner1.hasNext()){
            input.add(scanner1.nextInt());
        }
        M = scanner.nextInt();
        int len = input.size(), res = 0;
        int l = 0, r = 1;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (input.get(i) + input.get(j) <= M)
                    res++;
            }
        }
        System.out.println(res);
    }
}
