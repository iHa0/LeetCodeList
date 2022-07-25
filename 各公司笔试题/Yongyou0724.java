package TopInterview;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class d0723 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Map<Integer, Integer> map = new HashMap<>();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char a = s.charAt(i);
            if (a == '@' || a == '!' || a == '/') {
                if (a == '@') map.put(1, map.getOrDefault(1, 0) + 1);
                if (a == '!') map.put(1, map.getOrDefault(1, 0) + 2);
                if (a == '/') map.put(1, map.getOrDefault(1, 0) + 3);
            } else if (a >= 'a' && a <= 'c') {
                map.put(2, map.getOrDefault(2, 0) + a - 'a' + 1);
            } else if (a >= 'd' && a <= 'f') {
                map.put(3, map.getOrDefault(3, 0) + a - 'd' + 1);
            } else if (a >= 'g' && a <= 'i') {
                map.put(4, map.getOrDefault(4, 0) + a - 'g' + 1);
            } else if (a >= 'j' && a <= 'l') {
                map.put(5, map.getOrDefault(5, 0) + a - 'j' + 1);
            } else if (a >= 'm' && a <= 'o') {
                map.put(6, map.getOrDefault(6, 0) + a - 'm' + 1);
            } else if (a >= 'p' && a <= 's') {
                map.put(7, map.getOrDefault(7, 0) + a - 'p' + 1);
            } else if (a >= 't' && a <= 'v') {
                map.put(8, map.getOrDefault(8, 0) + a - 't' + 1);
            } else if (a >= 'w' && a <= 'z') {
                map.put(9, map.getOrDefault(9, 0) + a - 'w' + 1);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 1; i <= 9; i++) {
            if (map.containsKey(i)) {
                sb.append("[");
                sb.append(i);
                sb.append(",");
                sb.append(map.get(i));
                sb.append("]");
                if (i < 9) sb.append(",");
            }
        }
        sb.append("]");
        System.out.println(sb.toString());
    }
}
