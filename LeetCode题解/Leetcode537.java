public class LeetCode537 {
    public String complexNumberMultiply(String num1, String num2) {
        String[] s1 = num1.split("\\+");
        String[] s2 = num2.split("\\+");
        int a = Integer.valueOf(s1[0]);
        int b;
        if (s1[1].charAt(0) == '-'){
            b = - Integer.valueOf(s1[1].substring(1, s1[1].length() - 1));
        } else
            b = Integer.valueOf(s1[1].substring(0, s1[1].length()- 1));
        int c = Integer.valueOf(s2[0]);
        int d;
        if (s2[1].charAt(0) == '-'){
            d = - Integer.valueOf(s2[1].substring(1, s2[1].length() - 1));
        } else
            d = Integer.valueOf(s2[1].substring(0, s2[1].length() - 1));
        StringBuilder sb = new StringBuilder();
        sb.append(a * c + (-1) * (b * d) + "+" + ((a * d) + (b * c)) + "i");
        return sb.toString();
    }
}
