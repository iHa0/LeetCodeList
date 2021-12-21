package TopInterview;

public class TopInterview38 {
    public String countAndSay(int n) {
        String s = "";
        if (n == 1)
            return "1";
        String read = "11";
        if (n == 2)
            return read;
        String temp = "";
        for (int i = 2; i < n; i++) {
            int len = read.length();
            int right = 0;
            s = "";
            while (right < len){
                char a = read.charAt(right);
                int count = 1;
                while (right + 1 < len && read.charAt(right) == read.charAt(right + 1)){
                    count++;
                    right++;
                }
                s += count;
                s += a;
                right++;
            }
            read = s;
        }
        return s;
    }
}
