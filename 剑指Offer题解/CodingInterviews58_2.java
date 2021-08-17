public class CodingInterviews58 {
    public String reverseWords(String s) {
        s = s.trim();
        String[] strs = s.split(" ");
        String res = "";
        for (int i = strs.length - 1; i > 0; i--) {
            if (strs[i].length() == 0){
                continue;
            }
            res += strs[i] + " ";
        }
        res += strs[0];
        return res;
    }
}
