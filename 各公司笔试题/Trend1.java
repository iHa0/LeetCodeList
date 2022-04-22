import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String url = sc.nextLine();
        String[] temp = url.split(":");
        StringBuilder sb = new StringBuilder();
        sb.append(temp[0] + "://");
        int left = 0;
        while (left < temp[1].length()) {
            if (temp[1].charAt(left) == '/' || temp[1].charAt(left) == '\\')
                left++;
            else break;
        }
        sb.append(temp[1].substring(left - 1, temp[1].length()));
        System.out.println(sb.toString());
    }
}
