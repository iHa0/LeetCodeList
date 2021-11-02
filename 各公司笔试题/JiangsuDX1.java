import java.util.Scanner;

public class JiangsuDianxing {
    public String genStr(String command){
        int i = 0, j = 1;
        String res = "";
        while (j < command.length()){
            char a = command.charAt(i);
            int b = command.charAt(j) - '0';
            for (int k = 0; k < b; k++) {
                res += a;
            }
            i += 2;
            j += 2;
        }
        return res;
    }
    public String genStr2(String command){
        int left = 0, right = 0;
        while (right < command.length()){
            char a = command.charAt(left);

        }

        return null;
    }
}
